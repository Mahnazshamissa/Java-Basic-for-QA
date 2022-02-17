package t1I9;

import java.util.Scanner;

public class T1I9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte geben eine Gleitkommazahl ein.");
        double zahl = Double.parseDouble(in.nextLine());
        double verdoppeltZahl = 2.0D * zahl;
        double quadrierenZahl = zahl * zahl;
        double quadratwurzelZahl = Math.sqrt(zahl);
        System.out.println("Zahl verdoppeln ist: " + verdoppeltZahl + "     Zahl quadrieren ist: " + quadrierenZahl + "    Quadratwurzel ist: " + quadratwurzelZahl);

    }
}
