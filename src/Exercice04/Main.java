package Exercice04;

public class Main {

    public static void main(String[] args) {
        Employe[] employes = new Employe[] {
                new Employe("Dorine", 2000.0),
                new Manager("Juliette", 3000.0, 800.0)
        };

        for (Employe e : employes) {
            System.out.println(e.getNom() + ", salaire : " + e.calculerSalaire() + " €");
        }
    }
}