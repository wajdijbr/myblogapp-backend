package com.blog.demo.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.blog.demo.Entities.Produit;

@RepositoryRestResource
public interface ProduitRepos extends JpaRepository<Produit, Long> {
    public List<Produit> findAll();

    // @Query("SELECT u FROM Produit u WHERE u.Date = :email")
    // Produit findByDate(@Param("email") String email);
    public static Produit saveProduit(Produit produit) {
        return null;
    }
}
