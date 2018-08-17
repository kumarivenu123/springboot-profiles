package com.spring.profile;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("DEV")
public class TestConfiguration {
	
	@PostConstruct
	public void test() {
		System.out.println("DEV Configuration Loading...");
	}

}
