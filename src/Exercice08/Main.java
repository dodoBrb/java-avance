package Exercice08;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        LocalDate debut1 = LocalDate.of(2026, Month.JULY, 15);
        LocalDate fin1 = debut1.plusDays(7);

        LocalDate debut2 = LocalDate.of(2026, Month.NOVEMBER, 10);
        LocalDate fin2 = debut2.plusDays(3);

        LocalDate debut3 = LocalDate.of(2026, Month.AUGUST, 28);
        LocalDate fin3 = debut3.plusDays(5);

        Reservation[] reservations = {
                new Reservation("Rossignol", debut1, fin1),
                new Reservation("Barbey", debut2, fin2)
        };

        for (Reservation res : reservations) {
            boolean hauteSaison = Reservation.estEnHauteSaison(res.getDateArrivee());
            System.out.println("Client : " + res.getNomClient() + ", durée : " + res.dureeSejour() + " nuit(s), début haute saison : " + hauteSaison);
        }

        try {
            new Reservation("Marchais", LocalDate.of(2026, 6, 10), LocalDate.of(2026, 6, 5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}