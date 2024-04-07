package com.ives.apirestfulmongodb.repository;

import com.ives.apirestfulmongodb.domain.Post;
import com.ives.apirestfulmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTitleContainingIgnoreCase(String text);
}
