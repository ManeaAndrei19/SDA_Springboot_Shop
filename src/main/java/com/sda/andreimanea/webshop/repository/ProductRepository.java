package com.sda.andreimanea.webshop.repository;

import com.sda.andreimanea.webshop.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
