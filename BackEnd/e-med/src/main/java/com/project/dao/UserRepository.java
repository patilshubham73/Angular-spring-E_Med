package com.project.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.pojos.User;

public interface UserRepository extends CrudRepository<User,Integer> {
		
	public User findByEmailAndPassword(String email,String password);
	
	public Iterable<User> deleteByEmail(String email);
	
	
	
}
