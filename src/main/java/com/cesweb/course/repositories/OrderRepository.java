package com.cesweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
