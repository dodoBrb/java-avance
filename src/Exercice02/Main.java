package Exercice02;

public class Main {

    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("Alice", 100.0);
        System.out.println("Solde initial : " + compte.getSolde() + " €");

        compte.deposer(50.0);
        System.out.println("Solde après dépôt : " + compte.getSolde() + " €");

        try {
            compte.deposer(-20.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur capturée : " + e.getMessage());
        }
        try {
            compte.retirer(200.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur capturée : " + e.getMessage());
        }
    }
}