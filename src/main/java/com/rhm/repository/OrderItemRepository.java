package com.rhm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhm.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
