package com.lcwd.electronic.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.lcwd.electronic.store.repositories.UserRepository;

@SpringBootApplication 


public class ElectronicStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectronicStoreApplication.class, args);
	}
	@Autowired
    private UserRepository userRepository;
}
