package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class BoardApplication {

	public static void main(String[] args) {
		//TEST COMMIT
		System.out.println("TEST!!");
		SpringApplication.run(BoardApplication.class, args);
	}

}
