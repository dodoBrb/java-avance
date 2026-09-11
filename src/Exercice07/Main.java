package Exercice07;

public class Main {

    public static void main(String[] args) {
        Allumable[] appareils = new Allumable[] {
                new TelephonePortable(),
                new Lampe()
        };

        for (Allumable appareil : appareils) {
            appareil.allumer();
        }

        for (Allumable appareil : appareils) {
            if (appareil instanceof ConnecteWifi) {
                ConnecteWifi appareilWifi = (ConnecteWifi) appareil;
                appareilWifi.connecter("Maison_5G");
            } else {
                System.out.println(appareil.getClass().getSimpleName() + " ne supporte pas le Wi-Fi.");
            }
        }

        for (Allumable appareil : appareils) {
            if (appareil instanceof ConnecteWifi) {
                ConnecteWifi appareilWifi = (ConnecteWifi) appareil;
                appareilWifi.deconnecter();
            } else {
                System.out.println(appareil.getClass().getSimpleName() + " n'a pas de connexion Wi-Fi à couper.");
            }
        }

        for (Allumable appareil : appareils) {
            appareil.eteindre();
        }
    }
}