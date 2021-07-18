package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void intDb() {
		List<User> list = new ArrayList<>();
		list.add(new User(11, "chandu", "Devolper", 25));
		list.add(new User(06, "vinay", "tester", 24));
		list.add(new User(8, "naveen", "bussines", 27));
		list.add(new User(3, "bargav", "un-emp", 22));
		list.add(new User(10, "kalyan", "arch", 26));
		userRepository.saveAll(list);
	}

	public List<User> getUsers() {
		List<User> findAll = userRepository.findAll();
		return findAll;
	}

	public List<User> getPropfessions(String profession) {
		List<User> findByProfession = userRepository.findByProfession(profession);
		return findByProfession;
	}

	public List<User> getAge(Integer age) {
		List<User> findByAge = userRepository.findByAge(age);
		return findByAge;
	}
	
	// I want to retrive the data based on the profession and age
	public List<User> getPropfessionsAndgetAge(String profession,Integer age) {
	 List<User> findByProfessionAndAge = userRepository.findByProfessionAndAge(profession, age);
		return findByProfessionAndAge;
	}

}
