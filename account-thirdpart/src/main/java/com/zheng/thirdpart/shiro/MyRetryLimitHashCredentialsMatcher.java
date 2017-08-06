package com.zheng.thirdpart.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 密码重试次数
 * Created by zhenglian on 2017/6/25.
 */
public class MyRetryLimitHashCredentialsMatcher extends HashedCredentialsMatcher {
    
    private Cache<String, AtomicInteger> cache;

    public MyRetryLimitHashCredentialsMatcher(CacheManager cacheManager) {
        cache = cacheManager.getCache("passwordRetryCache");
    }

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        String username = token.getPrincipal().toString();
        AtomicInteger count = cache.get(username);
        if(!Optional.ofNullable(count).isPresent()) { // 初次登录,创建一个用户缓存
            count = new AtomicInteger(0);
            cache.put(username, count);
        }
        
        if(count.getAndIncrement() > 5) { // 超过5次就暂时禁用用户账号,5分钟后再登录
            throw new ExcessiveAttemptsException("您输入密码错误次数太频繁,系统将暂时禁用当前用户,您可以5分钟再试!");
        }
        
        // 进行登录认证
        boolean isMatch = super.doCredentialsMatch(token, info);
        if(isMatch) { //用户登录成功,需要清空缓存
            cache.remove(username);
        }
        
        return isMatch;
    }
}
