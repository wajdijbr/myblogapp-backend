package com.blog.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.blog.demo.Entities.Produit;
import com.blog.demo.Services.ProduitServices;

import java.util.List;
@RestController

@RequestMapping("/produits")
@CrossOrigin("*")
public class ProduitController {
    @Autowired
    private ProduitServices services;

    @RequestMapping(method = RequestMethod.GET)
    public List<Produit> getAllProduits() {
        return services.getAllProduits();
    }

    // @RequestMapping(value="/{id}",method = RequestMethod.GET)
    // public Produit getProduitById(@PathVariable("id") Long id) throws NotFoundException
    // {
    //     return services.getProduit(id);
    // }
    


    @RequestMapping(method = RequestMethod.POST)
    public Produit createProduit(@RequestBody Produit produit) {
        return services.saveProduit(produit) ;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Produit updateProduit(@RequestBody Produit produit) {
        return services.updateProduit(produit);

    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteProduit(@PathVariable("id") Long id)
    {
        Produit prod = null;
        try {
            prod = services.getProduit(id);
        } catch (NotFoundException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Get produit");
        }
        services.deleteProduit(prod);
    }



}