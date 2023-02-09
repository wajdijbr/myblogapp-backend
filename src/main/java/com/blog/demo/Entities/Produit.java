package com.blog.demo.Entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "produits")
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduit;
    @Column(columnDefinition = "TEXT")
    private String imgProduit;
    private String nomProduit;
    private String descProduit;
    private String urlProduit;
    private Double prixProduit;
    private Integer codeBarProduit;
    private Date date;

}
