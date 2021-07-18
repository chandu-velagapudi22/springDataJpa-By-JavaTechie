package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/javatechie")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/getusers")
	public List<User> getAllUsers() {
		List<User> users = userService.getUsers();
		return users;
	}

	@GetMapping("/getprofesion/{profession}")
	public List<User> getprofessions(@PathVariable("profession") String profession) {
		List<User> propfessions = userService.getPropfessions(profession);
		return propfessions;
	}

	@GetMapping("/getAge/{age}")
	public List<User> getprofessions(@PathVariable("age") Integer age) {
		List<User> age2 = userService.getAge(age);
		return age2;
	}

	@GetMapping("/getAge/{profession}/{age}")
	public List<User> getprofessionsAndAge(@PathVariable("profession") String profession,
			@PathVariable("age") Integer age) {
	 List<User> propfessionsAndgetAge = userService.getPropfessionsAndgetAge(profession, age);
		return propfessionsAndgetAge;
	}

}
