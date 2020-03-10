package com.api.brasfoot.brasfoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TesteController {
	@GetMapping("/index")
	public String uau() {
		return "uau";
	}
}
