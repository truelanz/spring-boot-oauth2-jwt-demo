package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	/* @Autowired
	private PasswordEncoder passwordEncoder; */

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/* 	//Criptografando password
		System.out.println("\nEncode = " + passwordEncoder.encode("123456"));

		//Comparando password criptografado com password digitado
		boolean encodeCompare = passwordEncoder.matches("123456", "$2a$10$oqz4hKEOgVHafUbYlXJ32e.fp1rFua6O0Xep3yGWGfv6qLS9uTdq6");
		System.out.println("Senha está correta? " + encodeCompare);
	} */
	}
}
