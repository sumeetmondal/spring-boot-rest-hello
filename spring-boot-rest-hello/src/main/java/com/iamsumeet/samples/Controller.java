package com.iamsumeet.samples;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value="/getHello")
	public String getHello(){
		System.out.println("Hello!");
		String hello = "hello";
		return hello;
	}

}
