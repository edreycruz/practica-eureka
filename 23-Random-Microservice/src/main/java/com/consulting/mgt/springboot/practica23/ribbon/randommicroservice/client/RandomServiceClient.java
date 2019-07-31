package com.consulting.mgt.springboot.practica23.ribbon.randommicroservice.client;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Primary
@Service
public class RandomServiceClient implements IRandomService {
	
	@Autowired()
	private Random random;
	
	@Override
	@SneakyThrows
	public int randomNext() {
		return random.nextInt(50);
	}
	
}
