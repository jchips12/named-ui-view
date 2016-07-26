package com.jchips12.nameduiview.service;

import java.util.List;

import com.jchips12.nameduiview.entity.User;

public interface UserService {

    User insert(User user);

    List<User> findAll();

    User findOne(String id);

    User save(User user);

    void delete(String id);

}
