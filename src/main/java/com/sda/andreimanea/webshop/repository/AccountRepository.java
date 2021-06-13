package com.sda.andreimanea.webshop.repository;

import com.sda.andreimanea.webshop.model.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {

    List<Account> findAllByIsClosed(Boolean isClosed);

    List<Account> findAllByBillingAddress(String billingAddress);

    List<Account> findAllByCreationDateBetween(Date creationDate,Date endDate);

    List<Account> findAllByBillingAddressIsContaining(String city);

    Account findByLogin(String login);



}
