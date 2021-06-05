package com.sda.andreimanea.webshop.repository;

import com.sda.andreimanea.webshop.model.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountRepository {
    private List<Account> accounts=new ArrayList<>();

    public List<Account> getAllAccounts(){
        return accounts;
    }

    public void save(Account account){
        accounts.add(account);
    }
}
