package com.blog.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.blog.demo.Entities.User;
import com.blog.demo.Repos.UserRepos;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    private UserRepos userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUser(Long id) throws NotFoundException {
        User user = userRepository.findById(id).get();
        if (user == null)
            throw new NotFoundException();
        return user;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

}
