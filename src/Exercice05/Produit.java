package Exercice05;

public class Produit {

    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("Produit : " + nom + ", prix : " + prix);
    }

    public void afficher(double remise) {
        double prixRemise = prix * (1 - remise / 100);
        System.out.println("Produit : " + nom + ", prix après remise : " + prixRemise);
    }

    public void afficher(String devise) {
        System.out.println("Produit : " + nom + ", prix : " + prix + " " + devise);
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }
}