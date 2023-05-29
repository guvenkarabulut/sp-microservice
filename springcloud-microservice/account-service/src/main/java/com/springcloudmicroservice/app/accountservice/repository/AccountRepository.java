package com.springcloudmicroservice.app.accountservice.repository;

import com.springcloudmicroservice.app.accountservice.entity.Account;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CassandraRepository<Account,String> {
}