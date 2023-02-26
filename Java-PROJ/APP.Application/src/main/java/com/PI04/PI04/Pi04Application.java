package com.PI04.PI04;

import com.PI04.PI04.model.User;
import com.PI04.PI04.repository.UserRepository;
import com.mongodb.internal.diagnostics.logging.Logger;
import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Calendar;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@RestController
@RequestMapping("")
public class Pi04Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Pi04Application.class, args);
		System.out.print("teste");
		User andry = new User();
		andry.setLastName("souza");
		andry.getLastName();
	}

	@Override
	public void run(String... args) throws Exception {


		record NewUserRequest(String email, String firstName, String lastName, LocalDate birthDate, String city, String state, double balance) {
			public void addUser(@RequestBody NewUserRequest request) {
				User andrya = new User();
				andrya.setEmail("andrya@gmail.com");
				andrya.setFirstName("Ândrya");
				andrya.setLastName("Silvestre");
				andrya.setBirthDate(2002, Calendar.JANUARY, 23);
				andrya.setCity("Recife");
				andrya.setState("PE");
				andrya.setBalance(100.0);

//				UserRepository.save(andrya);
				System.out.print(andrya);
			}
		}

	}
}

