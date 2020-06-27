package com.aha.smallmall.dao;

import org.springframework.data.repository.CrudRepository;

import com.aha.smallmall.model.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> {
    Users findByName(String name);
}