package Exercice09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> promo = new ArrayList<>();

        Etudiant e1 = new Etudiant("E001", "Dorine", 15.5);
        Etudiant e2 = new Etudiant("E002", "Juliette", 12.0);

        promo.add(e1);
        promo.add(e2);

        Etudiant e1Copie = new Etudiant("E001", "Dorine (doublon)", 8.0);

        System.out.println( e1.toString());
        System.out.println("e1.equals(e1Copie) : " + e1.equals(e1Copie));
        System.out.println("La liste contient-elle e1Copie ? " + promo.contains(e1Copie));
    }
}