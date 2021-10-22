package com.valeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringAssignmentApplication.class, args);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHome() {
		return "<h1>Hello client! How are you doing? :)</h1>";
	}
	
	@RequestMapping(value = "/random", method = RequestMethod.GET)
	public String getRandom() {
		return "<h1>Spring boot is great! So easy to just respond with strings</h1>";
	}


}
