package com.example.demo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ResponseMessage;
import com.example.demo.Model.UserModel;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ResponseMessage responseMessage;

    final Logger log = LoggerFactory.getLogger(UserService.class);

    public ResponseEntity<ResponseMessage> registerUserService(UserModel user) {

        userRepository.save(user);

        responseMessage.setSuccess(true);
        responseMessage.setMessage("User registred successfully");

        return ResponseEntity.status(HttpStatus.OK).body(responseMessage);
    }
}

