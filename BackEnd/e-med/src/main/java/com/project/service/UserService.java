package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.UserRepository;
import com.project.pojos.User;

@Service
public class UserService {

	@Autowired
	private UserRepository user_repo;	
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}

	public UserService(UserRepository repo) {
		super();
		this.user_repo = user_repo;
	}
	
	public void saveMyUser(User user) {
		user_repo.save(user);
	}
	
	public User findByEmailAndPassword(String email,String password) {
			return user_repo.findByEmailAndPassword(email, password);
	}
	
	public Iterable<User> deleteUserByEmail(String email){
		return user_repo.deleteByEmail(email);
	}
	
	public Iterable<User> getAllUsers(){
		return user_repo.findAll();
	}
	
	
	
}
