package com.ives.apirestfulmongodb.service.exception;

import com.ives.apirestfulmongodb.domain.Post;
import com.ives.apirestfulmongodb.domain.User;
import com.ives.apirestfulmongodb.dto.UserDTO;
import com.ives.apirestfulmongodb.repository.PostRepository;
import com.ives.apirestfulmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id){
        Optional<Post> user = postRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}