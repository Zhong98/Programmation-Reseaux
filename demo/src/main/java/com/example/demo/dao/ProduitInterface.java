package com.example.demo.dao;

import com.example.demo.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitInterface extends JpaRepository<Produit, Integer> {
}
