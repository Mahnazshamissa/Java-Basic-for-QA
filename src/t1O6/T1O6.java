package t1O6;

import java.util.Scanner;

public class T1O6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bruttopries eingeben");
        double bruttopries = Double.parseDouble(in.nextLine());
        System.out.println("Mwst eingeben");
        int mwst = Integer.parseInt(in.nextLine());
        double nettopreis = bruttopries / (1.0D + (double)mwst / 100.0D);
        System.out.format("bruttopries: %.2f\n nettopreis: %.2f\n ", bruttopries, nettopreis);
    }
}
