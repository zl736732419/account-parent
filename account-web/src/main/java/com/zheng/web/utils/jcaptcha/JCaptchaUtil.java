package com.zheng.web.utils.jcaptcha;

import com.octo.captcha.service.CaptchaServiceException;
import com.octo.captcha.service.captchastore.FastHashMapCaptchaStore;

import javax.servlet.http.HttpServletRequest;

/**
 * 验证码工具
 * Created by zhenglian on 2017/6/25.
 */
public class JCaptchaUtil {

    public static final MyManageableImageCaptchaService captchaService
            = new MyManageableImageCaptchaService(new FastHashMapCaptchaStore(),
            new GMailEngine(), 180, 100000, 75000);


    public static boolean validateResponse(HttpServletRequest request, String userCaptchaResponse) {
        if (request.getSession(false) == null) {
            return false;
        }
        boolean validated = false;
        try {
            String id = request.getSession().getId();
            validated = captchaService.validateResponseForID(id, userCaptchaResponse)
                            .booleanValue();
        } catch (CaptchaServiceException e) {
            e.printStackTrace();
        }
        return validated;
    }
    
    public static boolean hasCaptcha(
            HttpServletRequest request, String userCaptchaResponse) {
        if (request.getSession(false) == null) {
            return false;
        }
        boolean validated = false;
        try {
            String id = request.getSession().getId();
            validated = captchaService.hasCapcha(id, userCaptchaResponse);
        } catch (CaptchaServiceException e) {
            e.printStackTrace();
        }
        return validated;
    }

}
