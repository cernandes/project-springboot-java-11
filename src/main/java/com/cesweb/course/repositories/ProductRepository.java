package com.cesweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
