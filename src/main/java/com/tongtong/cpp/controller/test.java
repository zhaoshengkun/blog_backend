package com.tongtong.cpp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

	@GetMapping("/")
	public String hello() {
		String a = "123123";
		System.out.println(a);
		return a;
	}
}
