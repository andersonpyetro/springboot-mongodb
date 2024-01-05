package com.apyetro.projetomongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apyetro.projetomongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResouce {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria Bronw", "maria@gmail.com");
		User alex = new User("1", "Alex Green", "alex@gmail.com");
		List<User> list = new ArrayList<>();		
		list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok().body(list);
	}

}
