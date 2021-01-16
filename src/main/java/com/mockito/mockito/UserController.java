package com.mockito.mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private Userservice userservice;

    @RequestMapping("/hello")
    public ResponseEntity addUser() {
        User user = userservice.addUser(new User("shashi"));
       System.out.println(user);
        return new ResponseEntity("Hello", HttpStatus.OK);
    }
}
