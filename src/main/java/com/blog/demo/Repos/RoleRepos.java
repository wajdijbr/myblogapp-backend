package com.blog.demo.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.blog.demo.Entities.Role;

@RepositoryRestResource
public interface RoleRepos extends JpaRepository<Role, Long> {
    Role findByRole(String role);

    public List<Role> findAll();

    public static Role saveUser(Role role) {
        return null;
    }
}
