package com.jenkins.ou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping(value = "/user/createUser")
    public String createUser() {
        return "user/createSuccess";
    }

    @RequestMapping(value = "/user/register")
    public String register() {
        return "user/register";
    }
}