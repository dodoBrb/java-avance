package Exercice07;

public class Lampe implements Allumable {

    private boolean estAllumee;

    public Lampe() {
        this.estAllumee = false;
    }

    @Override
    public void allumer() {
        this.estAllumee = true;
        System.out.println("Lampe allumée.");
    }

    @Override
    public void eteindre() {
        this.estAllumee = false;
        System.out.println("Lampe éteinte.");
    }
}