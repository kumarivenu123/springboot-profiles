package com.spring.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class TestController {
	
	@Value("${value}")
	private String loadedYmlConfigData ;
	
	@GetMapping("/test")
	public String testService() {
		return loadedYmlConfigData;
	}

}
