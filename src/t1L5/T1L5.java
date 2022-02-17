package t1L5;

import java.util.Scanner;

public class T1L5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int summe = 0;
        int produkt = 1;
        System.out.println("Geben Sie eine ganze Zahl ein");
        int zahl = Integer.parseInt(in.nextLine());
        while (zahl != 0) {
            summe += zahl;
            produkt *= zahl;
            if (zahl >= 0) {
                System.out.println("Geben sie eine weitere ganze Zahl ein");
                zahl = Integer.parseInt(in.nextLine());
            } else {
                break;
            }
        }
        System.out.println("Summe den eingegeben Zahlen beträgt " + summe);
        System.out.println("Produkt den eingegeben Zahlen beträgt \n" + produkt);
    }
}
