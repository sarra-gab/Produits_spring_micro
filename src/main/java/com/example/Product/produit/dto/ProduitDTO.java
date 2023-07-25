package com.example.Product.produit.dto;

public class ProduitDTO {
    private int id;
    private String type;
    private long reference;
    private long decs;
    private int prix;

    public ProduitDTO(int id, String type, long reference, long decs, int prix) {
        this.id = id;
        this.type = type;
        this.reference = reference;
        this.decs = decs;
        this.prix = prix;
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
}
