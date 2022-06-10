package com.stackroute.emids;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EmidsJenkinsDockerExampleApplication {

	@RequestMapping("hello")
	public String sayHello() {
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(EmidsJenkinsDockerExampleApplication.class, args);
	}

}
