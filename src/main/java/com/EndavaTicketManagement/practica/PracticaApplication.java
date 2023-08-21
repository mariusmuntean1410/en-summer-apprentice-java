package com.EndavaTicketManagement.practica;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:5174")
public class PracticaApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext context = SpringApplication.run(PracticaApplication.class, args);







	}

}
