package t1O5;

import java.util.Scanner;

public class T1O5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Anzahl der 1Euro Münzen eingeben");
        int anzahlEinEuro = Integer.parseInt(in.nextLine());
        System.out.println("Anzahl der 2Euro Münzen eingeben");
        int anzahlZweiEuro = Integer.parseInt(in.nextLine());
        System.out.println("Anzahl der 5Euro Scheine eingeben");
        int anzahlFuenfEuro = Integer.parseInt(in.nextLine());
        int gesamtebetrag = anzahlEinEuro + anzahlZweiEuro * 2 + anzahlFuenfEuro * 5;
        System.out.println("Gesamtbetrag ist: " + gesamtebetrag);
    }
}
