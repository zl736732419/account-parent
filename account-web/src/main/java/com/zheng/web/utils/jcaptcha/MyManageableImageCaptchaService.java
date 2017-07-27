package com.zheng.web.utils.jcaptcha;

import com.octo.captcha.engine.CaptchaEngine;
import com.octo.captcha.service.captchastore.CaptchaStore;
import com.octo.captcha.service.image.DefaultManageableImageCaptchaService;

/**
 * 验证码仓库
 * 用于判断是否有相应的验证码存在
 * Created by zhenglian on 2017/6/25.
 */
public class MyManageableImageCaptchaService extends DefaultManageableImageCaptchaService {
    public MyManageableImageCaptchaService(
            CaptchaStore captchaStore,
            CaptchaEngine captchaEngine,
            int minGuarantedStorageDelayInSeconds,
            int maxCaptchaStoreSize,
            int captchaStoreLoadBeforeGarbageCollection) {
        super(captchaStore, captchaEngine, minGuarantedStorageDelayInSeconds,
                maxCaptchaStoreSize, captchaStoreLoadBeforeGarbageCollection);
    }

    /**
     * 判断session中指定的captcha是否符合
     * @param id
     * @param userCaptchaResponse
     * @return
     */
    public boolean hasCapcha(String id, String userCaptchaResponse) {
        return store.getCaptcha(id).validateResponse(userCaptchaResponse);
    }
}
