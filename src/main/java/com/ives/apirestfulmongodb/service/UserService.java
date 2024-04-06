package com.ives.apirestfulmongodb.service;

import com.ives.apirestfulmongodb.domain.User;
import com.ives.apirestfulmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public List<User> findAll(){
        return userRepo.findAll();
    }
}
