package Exercice04;

public class Employe {

    private String nom;
    private double salaireBase;

    public Employe(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    public double calculerSalaire() {
        return salaireBase;
    }

    public String getNom() {
        return nom;
    }

    public double getSalaireBase() {
        return salaireBase;
    }
}