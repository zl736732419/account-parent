package com.zheng.web.controller;

import com.zheng.web.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户注册
 * Created by zhenglian on 2017/6/25.
 */
@Controller
public class RegisterController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPage() {
        return "register";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView register(User user) {
        
        
        
        
        
        return null;
    }
}
