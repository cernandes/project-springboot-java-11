package com.cesweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
