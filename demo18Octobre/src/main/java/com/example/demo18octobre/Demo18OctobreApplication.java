package com.example.demo18octobre;

import com.example.demo18octobre.dao.ProduitInterface;
import com.example.demo18octobre.entities.Produit;
import com.example.demo18octobre.entities.ProduitType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class Demo18OctobreApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo18OctobreApplication.class, args);
    }
        @Bean
        CommandLineRunner runner(ProduitInterface produitInterface, RepositoryRestConfiguration configuration){
        return args -> {
            configuration.exposeIdsFor(Produit.class);
            produitInterface.save(new Produit(1, "Tablette", 1400, ProduitType.Informatique));
            produitInterface.save(new Produit(2, "Switch", 140,ProduitType.autre));
            produitInterface.save(new Produit(3, "Routeur", 400,ProduitType.Informatique));
            produitInterface.save(new Produit(4, "Ordinateur", 44,ProduitType.Informatique));

            produitInterface.findAll().forEach(produit ->{
                System.out.println(produit.getDesignation());
            });
        };
    };
}
