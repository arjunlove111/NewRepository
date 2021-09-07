package com.example.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.model.Student;

@RestController
public class MainController {

	
	@GetMapping("/getdata")
	public Student m1()
	{
		
		Student s=new Student();
		s.setId(100);
		s.setName("Arjun");
		s.setAddress("Pune");
		return s;
	}
	
	
	
}
