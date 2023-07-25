package com.example.Product.facture.repository;

import com.example.Product.Client.model.Client;
import com.example.Product.facture.model.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {

    Optional<Facture> findById(Long id);

    Facture save(Facture facture);

    void delete(Facture facture);

    void deleteById(Long id);
}
