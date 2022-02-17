package t1I4;

import java.util.Scanner;

public class T1I4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Anzahl der Fahrkarten eingeben");
        int anzahl = Integer.parseInt(in.nextLine());
        if (anzahl <= 0) {
            do {
                System.out.println("Bitte geben Sie noch ein Zahl größer als 0 ein.");
            } while(anzahl > 0);
        }

        System.out.println("Preis eingeben");
        double preis = Double.parseDouble(in.nextLine());
        System.out.println("Rabatt eingeben");
        int rabatt = Integer.parseInt(in.nextLine());
        if (rabatt <= 100) {
            double ermPreis = preis * (1.0D - (double)rabatt / 100.0D);
            double ermGesamtePreis = ermPreis * (double)anzahl;
            System.out.println("Anzahl der Fahrkarten: " + anzahl);
            System.out.format("Ermäßigter Preis einer Fahrkarte: %.2f € \n", ermPreis);
            System.out.format("Ermäßigter Gesamtpreis: %.2f € \n", ermGesamtePreis);
        } else {
            System.out.println("Rabatt soll kleiner oder gleich 100 sein.");
        }

    }
}
