package com.apyetro.projetomongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apyetro.projetomongo.domain.User;
import com.apyetro.projetomongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		
		return repo.findAll();
	}

}
