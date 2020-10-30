package com.cesweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
