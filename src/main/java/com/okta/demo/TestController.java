package com.okta.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/okta")
public class TestController {
	
	@GetMapping("/api")
	public String getMessage() {
		return "<h1>Welcome!</h1>";
	}

}
