package com.st.controller;

import com.st.annotation.CurrentUser;
import com.st.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lilimin
 * @Date: 2019/10/1 21:10
 */
@RestController
public class UserController {

    @RequestMapping(value = "userInfo", method = RequestMethod.GET)
    public Integer userInfo(@CurrentUser Integer id) {
        return id;
    }
}
