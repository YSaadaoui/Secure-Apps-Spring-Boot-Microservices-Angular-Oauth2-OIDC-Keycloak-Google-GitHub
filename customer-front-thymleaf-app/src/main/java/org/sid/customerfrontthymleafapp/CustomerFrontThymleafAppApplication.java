package org.sid.customerfrontthymleafapp;

import org.sid.customerfrontthymleafapp.entities.Customer;
import org.sid.customerfrontthymleafapp.repos.CustomerRepos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymleafAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerFrontThymleafAppApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(CustomerRepos customerRepos){
		return args -> {
			customerRepos.save(Customer.builder().name("imad").email("imad@gmail.com").build());
			customerRepos.save(Customer.builder().name("med").email("med@gmail.com").build());
			customerRepos.save(Customer.builder().name("imane").email("imane@gmail.com").build());
		};
	}
}
