package com.cg.elysia.web.controller;

import com.cg.elysia.common.util.DateUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class LoginController {
    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST}, value={"/",""})
    public String login(){
        return DateUtil.getBeforeDay(new Date(),1).toString();
    }
}
