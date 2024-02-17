package org.dj.controller;

import org.dj.dto.User;
import org.dj.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	private TestService service;
	
	@GetMapping("/user")
	public ResponseEntity<User> getUser() {
		return new ResponseEntity<>(service.getData(), HttpStatus.OK);
	}
}
