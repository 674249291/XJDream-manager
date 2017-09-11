package com.XJDream.controller;

import com.XJDream.pojo.TbUser;
import com.XJDream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiongjun on 2017/9/11.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById")
    @ResponseBody
    public TbUser getUserById(){
        return userService.getUserById(7L);
    }
}
