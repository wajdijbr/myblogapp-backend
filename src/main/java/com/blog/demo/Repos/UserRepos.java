package com.blog.demo.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.blog.demo.Entities.User;

@RepositoryRestResource
public interface UserRepos extends JpaRepository<User, Long> {
    public List<User> findAll();

    // @Query("SELECT u FROM Produit u WHERE u.Date = :email")
    // Produit findByDate(@Param("email") String email);
    public static User saveCategory(User user) {
        return null;
    }
}
