package Exercice07;

public class TelephonePortable implements Allumable, ConnecteWifi {

    private boolean estAllume;
    private String reseauConnecte;

    public TelephonePortable() {
        this.estAllume = false;
        this.reseauConnecte = null;
    }

    @Override
    public void allumer() {
        this.estAllume = true;
        System.out.println("Téléphone portable allumé.");
    }

    @Override
    public void eteindre() {
        this.estAllume = false;
        this.reseauConnecte = null;
        System.out.println("Téléphone portable éteint.");
    }

    @Override
    public void connecter(String reseau) {
        if (!estAllume) {
            System.out.println("Impossible de se connecter au Wi-Fi : le téléphone est éteint.");
            return;
        }
        this.reseauConnecte = reseau;
        System.out.println("Téléphone connecté au réseau Wi-Fi : " + reseau);
    }

    @Override
    public void deconnecter() {
        if (reseauConnecte != null) {
            System.out.println("Déconnexion du réseau Wi-Fi : " + reseauConnecte);
            this.reseauConnecte = null;
        } else {
            System.out.println("Le téléphone n'était pas connecté au Wi-Fi.");
        }
    }
}