package com.EndavaTicketManagement.practica;
import com.EndavaTicketManagement.practica.controller.CustomerController;
import com.EndavaTicketManagement.practica.repository.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PracticaApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext context = SpringApplication.run(PracticaApplication.class, args);


		Customer customer = new Customer("012");
		System.out.println(customer);


		CustomerService as1 = context.getBean(CustomerService.class);
		CustomerService as2 = context.getBean(CustomerService.class);
		System.out.println(as1.toString());
		System.out.println(as2.toString());



		for (String s : context.getBeanDefinitionNames()) {
//			System.out.println("This is a bean: " + s);
		}



		CustomerController ac = context.getBean(CustomerController.class);
		ac.toString();





	}

}
