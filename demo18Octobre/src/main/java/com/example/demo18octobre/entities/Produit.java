package com.example.demo18octobre.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data  @NoArgsConstructor @Getter @Setter @AllArgsConstructor
@Entity
public class Produit {
    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Id
    private int identifiant;
    private String designation;
    private double prix;
    private ProduitType produitType;

    /*public Produit(int identifiant, String designation, double prix) {
        this.identifiant = identifiant;
        this.designation = designation;
        this.prix = prix;
    }*/
}
