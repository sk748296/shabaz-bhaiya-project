package com.store.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.user.entites.User;

public interface UserRepository extends JpaRepository<User, String>{

}
