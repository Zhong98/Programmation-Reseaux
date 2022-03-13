package com.example.demo18octobre.dao;

import com.example.demo18octobre.entities.Produit;
import com.example.demo18octobre.entities.ProduitType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ProduitInterface extends JpaRepository<Produit,Integer> {
    public List<Produit> findByProduitType(ProduitType type);//http://localhost:9999/mesapi/produits/search/findByProduitType?type=informatique
    public List<Produit> findByPrixGreaterThan(double prix);
}
