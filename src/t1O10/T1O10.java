package t1O10;

import java.util.Scanner;

public class T1O10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Monatliche Fixgehalt des Verkäufers eingeben");
        double fixgehalt = Double.parseDouble(in.nextLine());
        System.out.println("Umsatz des Verkäufers eingeben");
        double umsatz = Double.parseDouble(in.nextLine());
        double gehaltBrutto = fixgehalt + umsatz * 0.05D;
        System.out.println("Das Bruttogehlat des Verkäufers beträgt " + gehaltBrutto);
    }
}
