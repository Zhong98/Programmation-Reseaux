package com.example.demo.entities;

import com.example.demo.dao.ProduitInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RestControlleur {
    @Autowired
    private ProduitInterface produitInterface;

    @GetMapping(value = "/bonjour")
    public String afficher(){
        return "Bonjour de @RestController";
    }

    @GetMapping(value = "produits")
    public List<Produit> produits(){
        return produitInterface.findAll();
    }

    @GetMapping("produits/{identifiant}")
    public Produit getProduit(@PathVariable int identifiant){
        return produitInterface.findById(identifiant).get();
    }

    @PostMapping(path = "/produits")
    public Produit save(@RequestBody Produit produit){
        return  produitInterface.save(produit);
    }


    @PutMapping("/produits")
    public Produit update(@RequestBody Produit produit, @PathVariable int identifiant){
        produit.setIdentifiant(identifiant);
        return  produitInterface.save(produit);
    }


    @DeleteMapping("/produits/{identifiant}")
    public void delete(@PathVariable int identifiant){
        produitInterface.deleteById(identifiant);
    }
}
