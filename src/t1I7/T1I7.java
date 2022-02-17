package t1I7;

import java.util.Scanner;

public class T1I7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Basisgehalt eingeben");
        int basisgehalt = Integer.parseInt(in.nextLine());
        System.out.println("Anzahl der Kinder eingegeben");
        int kinderanzahl = Integer.parseInt(in.nextLine());
        int zuschuss = 0;
        if (kinderanzahl == 1) {
            zuschuss += 100;
        }

        if (kinderanzahl == 2) {
            zuschuss += 230;
        } else if (kinderanzahl > 2) {
            zuschuss = kinderanzahl * 130;
        }

        int endgehalt = basisgehalt + zuschuss;
        System.out.println("Endgehalt ist: " + endgehalt);
    }
}
