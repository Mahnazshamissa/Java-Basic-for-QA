package t1I1;

import java.util.Scanner;

public class T1I1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ganze Zahl eingeben");
        int zahl = Integer.parseInt(in.nextLine());
        if (zahl != 0) {
            System.out.println("Kehrwert von " + zahl + " ist " + 1.0D / (double) zahl);
        } else {
            System.out.println("Division durch 0 nicht erlaubt");
        }
    }
}
