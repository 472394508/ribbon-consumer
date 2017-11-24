package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ConsumerService {
	
	@Autowired
	private RestTemplate  restTemplate;
	
	
	@HystrixCommand(fallbackMethod="helloFallback")
	public String helloService(){
		 return restTemplate.getForEntity("http://CLOUD-SERVER/user/index", String.class).getBody();
	}
	
	 public String helloFallback(){
		  return "error";
	  }

}
