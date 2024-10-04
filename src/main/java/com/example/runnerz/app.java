package com.example.runnerz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class app {

	private static final Logger log = LoggerFactory.getLogger(org.springframework.boot.actuate.autoconfigure.wavefront.WavefrontProperties.Application.class);
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(app.class, args);

		WelcomeMessage welcomeMessage = (WelcomeMessage) context.getBean("welcomeMessage");
		System.out.println(welcomeMessage.getWelcomeMessage());

		log.info("Checking if logs work: ");
	}

}
