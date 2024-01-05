package com.apyetro.projetomongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.apyetro.projetomongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
