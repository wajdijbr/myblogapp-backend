package com.blog.demo.Services;


import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.blog.demo.Entities.Produit;


public interface ProduitServices {

    Produit saveProduit(Produit p);

    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);
    Produit getProduit(Long id) throws NotFoundException;
    List<Produit> getAllProduits();
}
