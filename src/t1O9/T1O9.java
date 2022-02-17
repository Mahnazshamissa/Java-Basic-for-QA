package t1O9;

import java.util.Scanner;

public class T1O9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Anzahl der gefahrenen Kilometer eingeben");
        double anzahlKM = Double.parseDouble(in.nextLine());
        System.out.println("verbrauchten Liter Benzin eingeben");
        double benzinL = Double.parseDouble(in.nextLine());
        double benzinverbrauchPro100km = benzinL / anzahlKM * 100.0D;
        System.out.println("Benzinverbrauch Pro 100 KM beträgt: " + benzinverbrauchPro100km + " Liter");
        double preis = anzahlKM * 0.42D;
        System.out.format("Kilometergeld beträgt: " + preis + " €");
    }
}
