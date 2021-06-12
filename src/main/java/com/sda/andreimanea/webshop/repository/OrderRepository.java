package com.sda.andreimanea.webshop.repository;

import com.sda.andreimanea.webshop.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
