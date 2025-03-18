package edu.empdemo.example.ParksRecDem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories(basePackages = "edu.empdemo.example.ParksRecDem")
@ComponentScan
public class ParksRecDemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParksRecDemApplication.class, args);
	}

}
