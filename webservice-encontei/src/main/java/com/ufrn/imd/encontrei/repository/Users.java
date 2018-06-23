package com.ufrn.imd.encontrei.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufrn.imd.encontrei.model.User;

public interface Users extends JpaRepository<User, Integer> {

}
