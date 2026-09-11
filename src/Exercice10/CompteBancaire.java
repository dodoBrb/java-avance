package Exercice10;

public class CompteBancaire {
    private String titulaire;
    private double solde;

    public CompteBancaire(String titulaire, double soldeInitial) {
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant <= 0) {
            throw new MontantInvalideException("Le montant du retrait doit être positif.");
        }

        if (montant > solde) {
            double manquant = montant - solde;
            throw new SoldeInsuffisantException("Solde insuffisant.", manquant);
        }

        solde -= montant;
        System.out.println("Retrait réussi de " + montant + " €");
    }

    public double getSolde() {
        return solde;
    }
}