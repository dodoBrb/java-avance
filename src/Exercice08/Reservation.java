package Exercice08;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private final String nomClient;
    private final LocalDate dateArrivee;
    private final LocalDate dateDepart;

    public Reservation(String nomClient, LocalDate dateArrivee, LocalDate dateDepart) {
        if (dateArrivee == null || dateDepart == null || !dateDepart.isAfter(dateArrivee)) {
            throw new IllegalArgumentException("La date de départ doit être après la date d'arrivée.");
        }
        this.nomClient = nomClient;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
    }

    public long dureeSejour() {
        return ChronoUnit.DAYS.between(dateArrivee, dateDepart);
    }

    public static boolean estEnHauteSaison(LocalDate date) {
        if (date == null) return false;
        Month mois = date.getMonth();
        return mois == Month.JULY || mois == Month.AUGUST;
    }

    public String getNomClient() {
        return nomClient;
    }

    public LocalDate getDateArrivee() {
        return dateArrivee;
    }

    public LocalDate getDateDepart() {
        return dateDepart;
    }
}