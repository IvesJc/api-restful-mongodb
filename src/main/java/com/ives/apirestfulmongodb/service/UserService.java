package com.ives.apirestfulmongodb.service;

import com.ives.apirestfulmongodb.domain.User;
import com.ives.apirestfulmongodb.dto.UserDTO;
import com.ives.apirestfulmongodb.repository.UserRepository;
import com.ives.apirestfulmongodb.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public List<User> findAll(){
        return userRepo.findAll();
    }

    public User findById(String id){
        Optional<User> user = userRepo.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User user){
        return userRepo.insert(user);
    }

    public void delete(String id){
        findById(id);
        userRepo.deleteById(id);
    }

    public User fromDTO(UserDTO userDTO){
        return new User(userDTO.getId(),
                userDTO.getName(),
                userDTO.getEmail());
    }
}
