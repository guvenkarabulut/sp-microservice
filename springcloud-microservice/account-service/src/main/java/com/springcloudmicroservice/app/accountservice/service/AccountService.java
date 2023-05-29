package com.springcloudmicroservice.app.accountservice.service;

import com.springcloudmicroservice.app.accountservice.entity.Account;
import com.springcloudmicroservice.app.accountservice.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    public Account get(String id){
        return accountRepository
                .findById(id)
                .orElseThrow(
                        () -> new RuntimeException("This id not found!")
                );
    }
    public Account save(Account account){
        return accountRepository.save(account);
    }
    public Account update(String id,Account account){
        Assert.isNull(id,"Id cannot be null");
        return accountRepository.save(account);
    }
    public void delete(String id){
        accountRepository.deleteById(id);
    }
    public Account pagination(){
        return null;
    }
}