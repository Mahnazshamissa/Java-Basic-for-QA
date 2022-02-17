package t1I3;

import java.util.Scanner;

public class T1I3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Einkaufsbetrag eingeben");
        double betrag = Double.parseDouble(in.nextLine());
        int rabatt = 0;
        if (betrag >= 500.0D) {
            rabatt = 20;
        } else if (betrag >= 300.0D) {
            rabatt = 14;
        } else if (betrag >= 200.0D) {
            rabatt = 8;
        } else if (betrag >= 100.0D) {
            rabatt = 3;
        }

        System.out.println("Zu bezahlen: " + betrag * (1.0D - (double)rabatt / 100.0D));

    }
}
