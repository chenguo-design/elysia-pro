package com.cg.elysia.web.controller.Account;

import com.cg.elysia.common.dto.UserDTO;
import com.cg.elysia.service.account.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/account")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/user/add")
    public boolean addUser(UserDTO user){
        user = new UserDTO(2L,"3311","chenguo","123","admin");
        return userService.insert(user);
    }

    @PostMapping("/user/get")
    public String getById(Long id){
        return userService.getById(id).toString();
    }

}
