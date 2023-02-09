package com.blog.demo.Repos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.blog.demo.Entities.Posts;


@RepositoryRestResource
public interface PostsRepos extends JpaRepository<Posts, Long> {
    public List<Posts> findAll();
    // @Query("SELECT u FROM Produit u WHERE u.Date = :email")
    // Produit findByDate(@Param("email") String email);
    public static Posts saveCategory(Posts post) {
        return null;
    }
}
