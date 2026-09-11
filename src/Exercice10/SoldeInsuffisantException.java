package Exercice10;

public class SoldeInsuffisantException extends Exception {
    private final double montantManquant;

    public SoldeInsuffisantException(String message, double montantManquant) {
        super(message);
        this.montantManquant = montantManquant;
    }

    public double getMontantManquant() {
        return montantManquant;
    }
}