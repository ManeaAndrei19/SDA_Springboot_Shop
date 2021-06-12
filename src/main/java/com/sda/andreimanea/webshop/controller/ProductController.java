package com.sda.andreimanea.webshop.controller;

import com.sda.andreimanea.webshop.model.Product;
import com.sda.andreimanea.webshop.service.ProductService;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable(value = "id") Long productId) {
        Optional<Product> product = productService.findByID(productId);
        if (product.isPresent()) {
            return product.get();
        }
        throw new IllegalArgumentException();
    }

    @PostMapping("/products")
    public String createProduct(Product product) {
        productService.save(product);
        return "product saved";
    }
}
