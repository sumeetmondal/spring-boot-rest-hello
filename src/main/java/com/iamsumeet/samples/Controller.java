package com.iamsumeet.samples;

import java.math.BigInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value="/getHello")
	public String getHello(){
		System.out.println("Hello!");
		String hello = "hello";
		return hello;
	}


	@RequestMapping(value="/getFactorial")
	public BigInteger getFactorial(@RequestParam(value = "number") BigInteger number ){
		return Utils.factorial(number);
	}
	
	@RequestMapping(value="/getRandomFactorial")
	public String getFactorial(){
		BigInteger random = Utils.nextRandomBigInteger();
		return "Number: "+random+ " factorial: " +Utils.factorial(random);
	}
}
