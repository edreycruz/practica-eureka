package com.consulting.mgt.springboot.practica23.ribbon.usersmicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consulting.mgt.springboot.practica23.ribbon.usersmicroservice.client.AgeServiceClient;
import com.consulting.mgt.springboot.practica23.ribbon.usersmicroservice.client.IUppercaseService;
import com.consulting.mgt.springboot.practica23.ribbon.usersmicroservice.model.User;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Service
public class UsersService {

	@Autowired
	private AgeServiceClient ageServiceClient;

	@Autowired
	private IUppercaseService uppercaseServiceClient;

	@SneakyThrows
	public User getUser(String name) {
		int age = ageServiceClient.getAge();
		String nameUppercase = uppercaseServiceClient.toUppercase(name);
		return new User(nameUppercase, age);

	}

}
