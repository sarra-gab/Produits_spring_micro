package com.example.Product.produit.service;

import com.example.Product.produit.exception.ProduitException;
import com.example.Product.produit.model.Produit;
import com.example.Product.produit.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    public Produit createProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    public Produit getProduitById(Long id) {
        return produitRepository.findById(id)
                .orElseThrow(() -> new ProduitException("Produit introuvable avec l'ID : " + id));
    }


    public Produit updateProduit(long id, Produit produit) {
        Produit existingProduit = getProduitById(id);
        existingProduit.setType(produit.getType());
        existingProduit.setReference(produit.getReference());
        existingProduit.setDecs(produit.getDecs());
        existingProduit.setPrix(produit.getPrix());
        return produitRepository.save(existingProduit);
    }

    public boolean deleteProduit(long id) {
        Produit existingProduit = getProduitById(id);
        produitRepository.delete(existingProduit);
        return true;
    }
}
