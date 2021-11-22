package com.rohit.customer.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rohit.customer.data.entities.Customer;
import com.rohit.customer.data.repos.CustomerRepository;


@SpringBootTest
class CustomerdataApplicationTests {

	@Autowired
	private CustomerRepository repo;
	@Test
	void testCreateCustomer() {
		
		Customer customer = new Customer();
		customer.setName("John");
		customer.setEmail("john.cena@rohit.com");
		repo.save(customer);
	}
	
	@Test
	void testShowCustomer() {
		Customer customer = repo.findById(1l).get();
		System.out.println(customer);
		
	}
	@Test
	void testUpdateCustomer() {
		Customer customer = repo.findById(1l).get();
		customer.setEmail("ucantseeme@rohit.com");
		repo.save(customer);
	}
	
	@Test
	void testDeleteCustomer() {
		Customer customer = repo.findById(1l).get();
		repo.delete(customer);
	}
	

}
