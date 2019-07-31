package com.consulting.mgt.springboot.practica23.ribbon.usersmicroservice.client;

import org.springframework.stereotype.Service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
// @Primary
@Service
public class LocalUppercaseServiceClient implements IUppercaseService {

	@Override
	@SneakyThrows
	public String toUppercase(String name) {

		log.info("[local impl] generating uppercase value for {}", name);
		return name.toUpperCase();
	}

}
