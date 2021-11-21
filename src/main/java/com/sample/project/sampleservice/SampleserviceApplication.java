package com.sample.project.sampleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = "com.sample.project.sampleservice")
public class SampleserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(SampleserviceApplication.class, args);
	}

}