package com.example.Product.produit.model;


import javax.persistence.*;

@Entity
@Table(name = "produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private long reference;
    private long decs;
    private int prix;

    public Produit(int id, String type, long reference, long decs, int prix) {
        this.id = id;
        this.type = type;
        this.reference = reference;
        this.decs = decs;
        this.prix = prix;
    }
    public Produit(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getReference() {
        return reference;
    }

    public void setReference(long reference) {
        this.reference = reference;
    }

    public long getDecs() {
        return decs;
    }

    public void setDecs(long decs) {
        this.decs = decs;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", decs='" + decs + '\'' +
                ", type='" + type + '\'' +
                ", reference='" + reference + '\'' +
                ", prix=" + prix +
                '}';
    }
}

