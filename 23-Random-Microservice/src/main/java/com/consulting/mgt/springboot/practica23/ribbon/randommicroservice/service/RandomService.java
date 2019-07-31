package com.consulting.mgt.springboot.practica23.ribbon.randommicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consulting.mgt.springboot.practica23.ribbon.randommicroservice.client.IRandomService;

@Service
public class RandomService {
	
	@Autowired
	private IRandomService randomServiceClient;
	
	public int getRandomValueAge() {
		int age = randomServiceClient.randomNext();
		return age;
	}
	
}
