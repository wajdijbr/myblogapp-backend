package com.blog.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.blog.demo.Entities.Produit;
import com.blog.demo.Repos.ProduitRepos;

import java.util.List;
@Service
public class ProduitServicesImpl implements ProduitServices{
    @Autowired
    private ProduitRepos produitRepository;
    @Override
    public Produit saveProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p) {
        return produitRepository.save(p);
    }
    @Override
    public void deleteProduit(Produit p) {
        produitRepository.delete(p);
    }
    @Override
    public void deleteProduitById(Long id) {
        produitRepository.deleteById(id);
    }
    @Override
    public Produit getProduit(Long id) throws NotFoundException {
        Produit prod = produitRepository.findById(id).get();
        if(prod  ==  null) throw new NotFoundException();
        return prod;
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }



}
