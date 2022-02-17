package t1O3;

import java.util.Scanner;

public class T1O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Seite A");
        int seiteA = Integer.parseInt(in.nextLine());
        System.out.println("Seite B");
        int seiteB = Integer.parseInt(in.nextLine());
        int umfang = 2 * (seiteA + seiteB);
        int flaeche = seiteA * seiteB;
        System.out.println("Umfang: " + umfang);
        System.out.println("Fläche: " + flaeche);
    }
}
