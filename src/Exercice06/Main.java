package Exercice06;

public class Main {
    public static void main(String[] args) {
        Forme[] formes = new Forme[] {
                new Cercle(5.0),
                new Rectangle(4.0, 6.0),
                new Triangle(8.0, 3.0)
        };

        for (Forme f : formes) {
            System.out.print("Aire : ");
            f.afficherAire();
        }

        Forme plusGrandeForme = Forme.plusGrande(formes);
        if (plusGrandeForme != null) {
            System.out.print("La plus grande forme : ");
            plusGrandeForme.afficherAire();
        }
    }
}