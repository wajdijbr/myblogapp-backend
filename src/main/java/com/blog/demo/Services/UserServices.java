package com.blog.demo.Services;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.blog.demo.Entities.User;

public interface UserServices {

    User saveUser(User user);

    User updateUser(User user);

    void deleteUser(User user);

    void deleteUserById(Long id);

    User getUser(Long id) throws NotFoundException;

    List<User> getAllUser();
}
