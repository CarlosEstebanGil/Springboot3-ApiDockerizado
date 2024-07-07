package com.charly.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charly.docker.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
