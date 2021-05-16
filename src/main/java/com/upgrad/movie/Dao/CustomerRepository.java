package com.upgrad.movie.Dao;

import com.upgrad.movie.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer,Integer> {

    public List<Customer> findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
}
