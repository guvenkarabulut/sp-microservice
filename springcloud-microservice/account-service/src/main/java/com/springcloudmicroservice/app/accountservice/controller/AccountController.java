package com.springcloudmicroservice.app.accountservice.controller;

import com.springcloudmicroservice.app.accountservice.entity.Account;
import com.springcloudmicroservice.app.accountservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accounts")
public class AccountController {
    final AccountService accountService;

    @GetMapping("/{id}")
    public ResponseEntity<Account>get(@PathVariable String id){
        return ResponseEntity.ok(accountService.get(id));
    }
    @PostMapping
    public ResponseEntity<Account>save(@RequestBody Account account){
        return ResponseEntity.ok(accountService.save(account));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Account>update(@PathVariable("id") String id,@RequestBody Account account){
        return ResponseEntity.ok(accountService.update(id,account));
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        accountService.delete(id);
    }
    public ResponseEntity<Account>pagination(){
        return null;
    }
}