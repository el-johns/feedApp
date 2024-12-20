package com.bptn.feedApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.bptn.feedApp.jdbc.UserBean;
//import com.bptn.feedApp.jdbc.UserDao;
import com.bptn.feedApp.jpa.User;
import com.bptn.feedApp.repository.UserRepository;

@Service
public class UserService {

//	@Autowired
//	UserDao userDao;
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> listUsers() {
		return this.userRepository.findAll();
	}
	
	public Optional<User> findByUsername(String username) {
		return this.userRepository.findByUsername(username);
	}
	
	public void createUser(User user) {
		this.userRepository.save(user);
	}
}

