package com.zheng.web.utils.jcaptcha;

import org.apache.shiro.web.servlet.OncePerRequestFilter;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 生成验证码图片
 * Created by zhenglian on 2017/6/25.
 */
public class JCaptchaFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) servletRequest; 
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        
        response.setDateHeader("Expires", 0L);
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");
        
        String sessionId = request.getRequestedSessionId();
        BufferedImage image = JCaptchaUtil.captchaService.getImageChallengeForID(sessionId);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
        try {
            out.flush();
        } finally {
            out.close();
        }
    }
}
