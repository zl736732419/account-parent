package com.zheng.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 欢迎页
 * Created by zhenglian on 2017/6/22.
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    
}
