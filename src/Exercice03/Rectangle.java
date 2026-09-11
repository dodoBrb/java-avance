package Exercice03;

public class Rectangle {

    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Rectangle(double cote) {
        this(cote, cote);
    }

    public Rectangle() {
        this(1.0);
    }

    public double aire() {
        return largeur * hauteur;
    }

    public double perimetre() {
        return 2 * (largeur + hauteur);
    }

    public double getLargeur() {
        return largeur;
    }

    public double getHauteur() {
        return hauteur;
    }
}