package com.example.demo18octobre.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "designationprix", types = Produit.class)
public interface Projection2 {
    public String getDesignation();
    public double getPrix();
}
