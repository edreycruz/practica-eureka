package com.consulting.mgt.springboot.practica23.ribbon.agemicroservice.client;

import java.net.URI;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Service
public class RandomServiceClientRestTemplate implements IRandomClient {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${random-service-name:random-microservice}")
	private String serviceName;

	@SneakyThrows
	@Override
	public int getRandomValue() {
		URI uri = new URI("http://" + serviceName + "/random-service/rndm");
		Map<String, Object> mapResponse = restTemplate.getForObject(uri, Map.class);
		return (int) mapResponse.get("random");
	}

}
