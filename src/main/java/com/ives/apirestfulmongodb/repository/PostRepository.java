package com.ives.apirestfulmongodb.repository;

import com.ives.apirestfulmongodb.domain.Post;
import com.ives.apirestfulmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
