package com.example.main.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.main.JunitExampleApplicationTests;

@SpringBootTest
public class TestMainController extends JunitExampleApplicationTests{

	
	@Autowired 
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;

	
	@Test
	public void testData() throws Exception {
		mockMvc=MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		
		mockMvc.perform(get("/getdata")).andExpect(status().isOk())
		.andExpect(content().contentType("application/json"))
		.andExpect(jsonPath("$.id").value("100")).andExpect(jsonPath("$.name").value("Arjun"))
		.andExpect(jsonPath("$.address").value("Pune"));
		 	
	}
	
	
}
