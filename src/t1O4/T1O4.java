package t1O4;

import java.util.Scanner;

public class T1O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Radius als ganze Zahl eingeben");
        int radius = Integer.parseInt(in.nextLine());
        double umfang = (double)(2 * radius) * 3.141592653589793D;
        double flaeche = (double)(radius * radius) * 3.141592653589793D;
        System.out.println("Umfang: " + umfang);
        System.out.println("Fläche: " + flaeche);
        System.out.format("Umfang: %.2f Fläche: %.2f\n ", umfang, flaeche);
    }
}
