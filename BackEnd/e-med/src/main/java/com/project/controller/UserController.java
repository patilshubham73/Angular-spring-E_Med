package com.project.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.pojos.User;
import com.project.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserController {
		
	@Autowired
	private UserService service;
	
//	@PostMapping( path = "/save-user", produces=MediaType.APPLICATION_JSON_VALUE)
//	@Transactional
//	public String registerUser(@RequestBody User user) {
//		service.saveMyUser(user);
//		System.out.println("in registerUser"+getClass());
//		return "hello"+user.getName()+"Your registration is successully";
//		
//	}
	
	@PostMapping("/save-user")
	public ResponseEntity<User> registerUser(@RequestBody User user)
	{
		service.saveMyUser(user);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	
	@GetMapping("/search/{email}/{password}")
	public User searchUser(@PathVariable String email,@PathVariable String password) {
		return service.findByEmailAndPassword(email, password);
	} 
	
	@PostMapping("/login")
	@ResponseBody
	public User loginUser(@RequestBody User user) {
		String tempEmail=user.getEmail();
		String tempass=user.getPassword();
		User userobj=null;
		if (tempEmail!=null && tempass != null) {
			userobj=service.findByEmailAndPassword(tempEmail, tempass);	
		}
		return userobj;
		
	}
	
	@DeleteMapping("/delete-user/{email}")
	@Transactional
	public Iterable<User> deleteUser(@PathVariable String email){
		
		return service.deleteUserByEmail(email);
	}
	
	@GetMapping("/getallusers")
	public Iterable<User> getAllUsers(){
		return service.getAllUsers();
	}
	
	
	
}
