package com.gilmariopereira.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilmariopereira.hruser.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}

