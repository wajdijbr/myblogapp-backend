package com.blog.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.blog.demo.Entities.User;
import com.blog.demo.Services.UserServices;

import java.util.List;

@RestController

@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserServices services;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAllUser() {
        return services.getAllUser();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") Long id) throws NotFoundException {
        return services.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return services.saveUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public User updateUser(@RequestBody User User) {
        return services.updateUser(User);

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteProduit(@PathVariable("id") Long id) {
        User user = null;
        try {
            user = services.getUser(id);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Get post");
        }
        services.deleteUser(user);
    }

}