package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.ConsumerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class ConsumerController {

	@Autowired
	private ConsumerService consumerService;
	
	@RequestMapping(value="/ribbon-consumer",method=RequestMethod.GET)
	public String  helloConsumer(){
		return consumerService.helloService();
	}
    
 
    
    
    

    
}
