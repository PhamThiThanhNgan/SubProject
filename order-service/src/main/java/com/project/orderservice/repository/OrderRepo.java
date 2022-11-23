package com.project.orderservice.repository;

import com.project.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepo extends JpaRepository<Order, Integer> {

    @Query(value = "SELECT * FROM orders o WHERE o.customerid = ?", nativeQuery = true)
    public Order getOrderByCustomerId(int customerID);
}
