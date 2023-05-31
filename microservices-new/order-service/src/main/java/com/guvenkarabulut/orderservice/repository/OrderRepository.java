package com.guvenkarabulut.orderservice.repository;

import com.guvenkarabulut.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
