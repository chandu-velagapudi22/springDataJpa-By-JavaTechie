package com.example.demo.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User, Serializable> {

	public List<User> findByProfession(String profession);

	public List<User> findByAge(Integer age);

	// I want to retrive the data based on the profession and age
	public List<User> findByProfessionAndAge(String profession, Integer age);

	// I wnat to retrive the data but i dont want to retrive the profession as
	// Devolper
	public List<User> findByProfessionIgnoreCase(String profession);
}
