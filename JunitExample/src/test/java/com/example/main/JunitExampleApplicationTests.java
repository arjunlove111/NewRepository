package com.example.main;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;


@SpringBootTest
@ComponentScan(basePackages = "com.example.main.controller")
public class JunitExampleApplicationTests {

	@Test
	void contextLoads() {
	}

}
