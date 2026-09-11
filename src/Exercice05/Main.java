package Exercice05;

public class Main {

    public static void main(String[] args) {
        Produit produit = new Produit("Clavier Mécanique", 80.0);

        produit.afficher();
        produit.afficher(15.0);
        produit.afficher("EUR");
    }
}