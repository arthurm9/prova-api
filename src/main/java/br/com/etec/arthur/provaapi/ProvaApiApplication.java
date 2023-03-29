package br.com.etec.arthur.provaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProvaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaApiApplication.class, args);
		System.out.println("API RUNNING");
	}

}
