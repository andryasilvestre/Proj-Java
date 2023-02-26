package com.PI04.PI04.controller;

import com.PI04.PI04.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/User")
public class UserController {
    private final UserRepository repository;
    public UserController (UserRepository repository) {
        this.repository = repository;
    }

//    @GetMapping("/{Id}")
//    public GetUser

}
