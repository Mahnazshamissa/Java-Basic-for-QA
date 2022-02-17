package t1O11;

import java.util.Scanner;

public class T1O11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Stundensatz des Mitarbeiters in € eingeben");
        double stundensatz = Double.parseDouble(in.nextLine());
        System.out.println("Anzahl der geleisteten 50% Überstunden eingeben");
        int anzUeberst50 = Integer.parseInt(in.nextLine());
        System.out.println("Anzahl der geleisteten 100% Überstunden eingeben");
        int anzUeberst100 = Integer.parseInt(in.nextLine());
        double gesamtGehalt = stundensatz * (154.0D + (double)anzUeberst50 + (double)anzUeberst100);
        System.out.println("Das monatliche Gesamtgehalt des Mitarbeiters mit dem Stundensatz " + stundensatz + " €/Stunde, mit " + anzUeberst50 + " geleisten 50% Überstunden und " + anzUeberst100 + " geleisteten 100% Überstunden beträgt " + gesamtGehalt + "€.");
    }
}
