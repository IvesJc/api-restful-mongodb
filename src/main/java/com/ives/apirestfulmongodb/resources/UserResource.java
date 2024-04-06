package com.ives.apirestfulmongodb.resources;


import com.ives.apirestfulmongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    // ou @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User ives = new User("100", "Ives", "ives@gmail.com");
        User mauro = new User("101", "Mauro", "mauro@gmail.com");
        List<User> list = new ArrayList<>(Arrays.asList(ives, mauro));
        return ResponseEntity.ok().body(list);
    }
}
