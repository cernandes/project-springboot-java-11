package com.cesweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
