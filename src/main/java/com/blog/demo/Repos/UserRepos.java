package com.blog.demo.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.blog.demo.Entities.User;

@RepositoryRestResource
public interface UserRepos extends JpaRepository<User, Long> {
    User findByUsername(String username);

    public List<User> findAll();

    public static User saveUser(User user) {
        return null;
    }
}
