package com.jchips12.nameduiview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jchips12.nameduiview.entity.User;
import com.jchips12.nameduiview.service.UserService;

@RestController
@RequestMapping(path = { "/rest/users" })
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(path = { "/insert" }, method = RequestMethod.PUT)
    public User insert(@RequestBody User user) {
        return service.insert(user);
    }

    @RequestMapping(path = { "/" }, method = RequestMethod.GET)
    public List<User> findAll() {
        return service.findAll();
    }

    @RequestMapping(path = { "/find/{id}" }, method = RequestMethod.GET)
    public User findOne(@PathVariable String id) {
        return service.findOne(id);
    }

    @RequestMapping(path = { "/save" }, method = RequestMethod.POST)
    public User save(@RequestBody User user) {
        return service.save(user);
    }

    @RequestMapping(path = { "/delete/{id}" }, method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

}
