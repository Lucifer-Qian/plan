package com.plan.dream.controller;

import com.plan.dream.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Author qianmingchao
 * @Date 2023/10/23 20:44
 * @Description:
 */

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/register")
    public void insert(){
        loginService.insert();
    }



}
