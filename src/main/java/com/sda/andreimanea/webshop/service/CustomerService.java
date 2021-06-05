package com.sda.andreimanea.webshop.service;

import com.sda.andreimanea.webshop.model.Account;
import com.sda.andreimanea.webshop.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final AccountRepository accountRepository;

    //injected by spring by the constructor
    public CustomerService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void addCustomer(Account account){
        accountRepository.save(account);
    }

    public List<Account> getCustomerAccounts(){
        return accountRepository.getAllAccounts();
    }
}
