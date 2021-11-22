package com.rohit.customer.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.rohit.customer.data.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
