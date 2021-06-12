package com.sda.andreimanea.webshop.service;

import com.sda.andreimanea.webshop.model.Product;
import com.sda.andreimanea.webshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired // injectarea in constructorul asta o va face Spring-ul
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public void save(Product product) {
        productRepository.save(product);
    }

    public List<Product> findAll(){
        //return new ArrayList<Product>((Collection<? extends Product>) productRepository.findAll());
        //feriti-va de cast-uri !!!
        return StreamSupport.stream(productRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Optional<Product> findByID(Long productId){
        return productRepository.findById(productId);
    }
}
