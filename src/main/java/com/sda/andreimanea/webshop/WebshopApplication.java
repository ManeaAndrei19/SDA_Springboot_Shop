package com.sda.andreimanea.webshop;

import com.sda.andreimanea.webshop.model.Account;
import com.sda.andreimanea.webshop.model.Customer;
import com.sda.andreimanea.webshop.repository.AccountRepository;
import com.sda.andreimanea.webshop.service.CustomerService;
import com.sda.andreimanea.webshop.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.sda.andreimanea.webshop.repository")
@EntityScan(basePackages = "com.sda.andreimanea.webshop.model")
public class WebshopApplication implements CommandLineRunner {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private MailService mailService;

    @Autowired
    private AccountRepository accountRepository;

    public static void main(String[] args) {
        SpringApplication.run(WebshopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.refresh();

        //here we have the context
        Account account1 = new Account();
        account1.setId(1L);

        Customer customer1 = new Customer();
        customer1.setId(1L);

        customerService.addCustomer(account1, customer1);
        customerService.getCustomerAccounts().forEach(account -> {
            System.out.println(account.toString());
        });
        System.out.println("\n##################################################\n");



//        accountRepository.findAllByBillingAddressContaining("Hill").forEach(System.out::println);
//        System.out.println("\n##################################################\n");
//        accountRepository.findAllByBillingAddress("0 Banding Street").forEach(System.out::println);
//        System.out.println("\n##################################################\n");
//        accountRepository.findAllByIsClosed(false).forEach(System.out::println);
//        System.out.println("\n##################################################\n");


/*
        mailService.sendMail("maneaandrei19@yahoo.com",
                "client@example.com",
                "Mock mail subject",
                "Mock mail content");
*/

    }
}
