package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ResponseMessage;
import com.example.demo.Model.UserModel;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("adduser")
    public ResponseEntity<ResponseMessage> registerUser(@RequestHeader int userId, @RequestHeader String userName,
            @RequestHeader String password) {
        UserModel user = new UserModel();
        user.setUserId(userId);
        user.setUserName(userName);
        user.setPassword(password);
        return userService.registerUserService(user);
    }
}
