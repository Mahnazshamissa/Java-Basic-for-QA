package t1I6;

import java.util.Scanner;

public class T1I6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Jahresgehalt eingeben");
        double jahresgehalt = Double.parseDouble(in.nextLine());
        double steuerbetrag = 0.0D;
        if (jahresgehalt > 11000.0D && jahresgehalt <= 18000.0D) {
            steuerbetrag = (jahresgehalt - 11000.0D) / 7000.0D * 1750.0D;
        } else if (jahresgehalt <= 31000.0D) {
            steuerbetrag = (jahresgehalt - 18000.0D) / 13000.0D * 4550.0D + 1750.0D;
        } else if (jahresgehalt <= 60000.0D) {
            steuerbetrag = (jahresgehalt - 31000.0D) / 29000.0D * 12180.0D + 6300.0D;
        } else if (jahresgehalt <= 90000.0D) {
            steuerbetrag = (jahresgehalt - 60000.0D) / 30000.0D * 14400.0D + 18480.0D;
        } else if (jahresgehalt <= 1000000.0D) {
            steuerbetrag = (jahresgehalt - 90000.0D) / 910000.0D * 455000.0D + 32880.0D;
        } else if (jahresgehalt > 1000000.0D) {
            steuerbetrag = (jahresgehalt - 1000000.0D) * 0.55D + 487880.0D;
        }

        System.out.println("Steuerbetrag ist: " + steuerbetrag);
        System.out.println("Steuersatz ist: " + steuerbetrag * 100.0D);
    }
}
