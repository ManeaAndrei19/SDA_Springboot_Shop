package com.sda.andreimanea.webshop.repository;

import com.sda.andreimanea.webshop.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
