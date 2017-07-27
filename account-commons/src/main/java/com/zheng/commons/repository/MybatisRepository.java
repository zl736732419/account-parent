package com.zheng.commons.repository;

import java.lang.annotation.*;

/**
 * 用于mybatis管理所有repository
 * Created by zhenglian on 2017/6/22.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MybatisRepository {
}
