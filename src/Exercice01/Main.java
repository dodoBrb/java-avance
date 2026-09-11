package Exercice01;

public class Main {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Le Comte de Monte-Cristo", "Alexandre Dumas", 1234);
        Livre livre2 = new Livre("Harry Potter", "J.K. Rolling", 1478);

        livre1.emprunter();
        livre1.emprunter();


        livre1.rendre();
        livre1.emprunter();

        livre2.emprunter();
    }
}