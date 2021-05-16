package com.upgrad.movie;

import com.upgrad.movie.Dao.CustomerRepository;
import com.upgrad.movie.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MovieApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	public static void main(String[] args) {

	 SpringApplication.run(MovieApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer(1,"prajwal","MJ","praj1234","88888",
				LocalDateTime.of(1995,2,3,4,3,0,2));
		Customer customer1 = new Customer(2,"praj","MJ","praj123","88888",
				LocalDateTime.of(1996,2,3,4,3,0,2));

		/**
		 * Saving the data
		 */
		customerRepository.save(customer);
		customerRepository.save(customer1);

		/**
		 * Fetching data from Mongo
		 */
         for(Customer customer2 : customerRepository.findAll()){
			 System.out.println(customer2);
		 }

		System.out.println(customerRepository.findByFirstName("prajwal").toString());

		/**
		 * Fetching data by LastName
		 */
		System.out.println(customerRepository.findByLastName("MJ"));

	}


}
