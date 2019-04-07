package com.jenkins.ou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @RequestMapping(value = "/roles",method = RequestMethod.POST)
    public String create() {
        return "roles/create";
    }

    @RequestMapping(value = "/roles",method = RequestMethod.DELETE)
    public String delete() {
        return "roles/delete";
    }
}