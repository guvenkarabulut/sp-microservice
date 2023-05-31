package com.guvenkarabulut.productservice.repository;

import com.guvenkarabulut.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
