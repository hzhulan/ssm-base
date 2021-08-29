package com.fiberhome.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: pp_lan
 * @date: 2021/8/29 8:25
 */
@Controller
public class LoginController {

    public LoginController() {
        System.out.println("===================== login 初始化 =====================");
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

}
