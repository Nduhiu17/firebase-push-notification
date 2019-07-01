package com.firebase.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class NotificationApplication {

	public static void main(String[] args)  {
		SpringApplication.run(NotificationApplication.class, args);
		System.out.println("Hello from firebase");
	}


}
