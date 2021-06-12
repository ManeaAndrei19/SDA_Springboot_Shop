package com.sda.andreimanea.webshop;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.sda.andreimanea.webshop.repository")
@EntityScan(basePackages = "com.sda.andreimanea.webshop.model")
public class RESTWebshopApplication {


    public static void main(String[] args) {
        SpringApplication.run(RESTWebshopApplication.class, args);
    }

}
