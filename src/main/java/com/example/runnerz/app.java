package com.example.runnerz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import foo.bar.WelcomeMessage;

@SpringBootApplication
public class app {

	public static void main(String[] args) {
		SpringApplication.run(app.class, args);

		var welcomeMessage = new WelcomeMessage();
		System.out.println(welcomeMessage.getWelcomeMessage());
	}

}
