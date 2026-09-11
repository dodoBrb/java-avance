package Exercice06;

abstract class Forme {
    public abstract double aire();

    public void afficherAire() {
        System.out.println(aire());
    }

    public static Forme plusGrande(Forme[] formes) {
        if (formes == null || formes.length == 0) {
            return null;
        }

        Forme maxForme = formes[0];
        for (Forme f : formes) {
            if (f.aire() > maxForme.aire()) {
                maxForme = f;
            }
        }
        return maxForme;
    }
}
