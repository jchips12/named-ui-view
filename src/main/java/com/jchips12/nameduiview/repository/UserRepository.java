package com.jchips12.nameduiview.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jchips12.nameduiview.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

}
