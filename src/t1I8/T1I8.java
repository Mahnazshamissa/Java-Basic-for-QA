package t1I8;

import java.util.Scanner;

public class T1I8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("handelt es sich um Bier oder Wein (B/W)");
        char getraenk = in.nextLine().charAt(0);
        System.out.println("Anzahl der Faesser eingegeben");
        double faesser = Double.parseDouble(in.nextLine());
        double seidel = 0.0D;
        if (getraenk != 'B' && getraenk != 'b') {
            if (getraenk == 'W' || getraenk == 'w') {
                seidel = faesser * 10.0D * 40.0D * 4.0D;
            }
        } else {
            seidel = faesser * 2.0D * 40.0D * 4.0D;
        }

        System.out.format("Sie haben % .2fSeidel ", seidel);
    }
}
