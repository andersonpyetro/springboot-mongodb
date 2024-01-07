package com.apyetro.projetomongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.apyetro.projetomongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}