package com.ives.apirestfulmongodb.resources;


import com.ives.apirestfulmongodb.domain.Post;
import com.ives.apirestfulmongodb.domain.User;
import com.ives.apirestfulmongodb.dto.UserDTO;
import com.ives.apirestfulmongodb.repository.PostRepository;
import com.ives.apirestfulmongodb.service.UserService;
import com.ives.apirestfulmongodb.service.exception.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post post = postService.findById(id);
        return ResponseEntity.ok().body(post);
    }


}
