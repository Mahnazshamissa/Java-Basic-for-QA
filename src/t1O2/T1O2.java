package t1O2;

import java.util.Scanner;

public class T1O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ganze Zahl zum Quadrieren eingeben");
        int zahl = Integer.parseInt(in.nextLine());
        int quadrat = zahl * zahl;
        System.out.println("Das Quadrat von " + zahl + " ist " + quadrat);
    }

}
