package com.spring.security.controller;

import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.spring.security.domain.Users;
import com.spring.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/get-all-user")
    public ResponseEntity<List<Users>> getAllUser(){
        return new ResponseEntity<>(userService.getAlluser(), HttpStatus.OK);
    }

    @PostMapping("/register")
    public Users createUser(@RequestBody Users user){
        return userService.register(user);
    }

}
