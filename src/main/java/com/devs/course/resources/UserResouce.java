package com.devs.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devs.course.entities.User;

@RestController
@RequestMapping(value = "/users")  //controlador Rest que responde no caminho Users
public class UserResouce {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Alex", "c.alex.cirilo@gmail.com","999999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
