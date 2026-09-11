package Exercice10;

public class Main {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("Juliette", 200.0);
        traiterRetrait(compte, 350.0);
        System.out.println();
        traiterRetrait(compte, -50.0);
        System.out.println();
        traiterRetrait(compte, 100.0);
    }

    private static void traiterRetrait(CompteBancaire compte, double montant) {
        try {
            compte.retirer(montant);
        } catch (SoldeInsuffisantException e) {
            System.err.println("Erreur : " + e.getMessage());
            System.err.println("Montant manquant : " + e.getMontantManquant() + " €");
        } catch (MontantInvalideException e) {
            System.err.println("Erreur : " + e.getMessage());
        } finally {
            System.out.println("Solde final : " + compte.getSolde() + " €");
        }
    }
}