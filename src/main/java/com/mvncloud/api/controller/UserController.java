package com.mvncloud.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

	
	@GetMapping("/user")
	public String userinfo() {
		
		return "Hello user, please register here...";
		
	}
	
}
