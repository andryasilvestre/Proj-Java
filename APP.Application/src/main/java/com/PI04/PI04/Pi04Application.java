package com.PI04.PI04;

import com.PI04.PI04.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan("com.PI04.PI04")
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@RestController
@RequestMapping("")
public class Pi04Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Pi04Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}

