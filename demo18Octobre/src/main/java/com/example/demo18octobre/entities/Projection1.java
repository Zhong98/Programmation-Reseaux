package com.example.demo18octobre.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "designation", types = Produit.class)
public interface Projection1 {
    public String getDesignation();
}
