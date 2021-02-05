package com.aerotop.ssosubsysb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: SubSystemB
 * @Description: TODO
 * @Author: gaosong
 * @Date 2021/2/4 16:57
 */
@Controller
public class SubSystemB {
    @RequestMapping("/test")
    public String test(HttpServletRequest request, Model model) {
        return "test";
    }
    @RequestMapping("/success")
    public String success(HttpServletRequest request, Model model) {
        return "success";
    }
}
