package t1A7;

import java.util.Scanner;

public class T1A7 {

    public static void main(String[] args) {
        /*
        1235.12

        500:2     235.12
        200:1     35.12
        20:1      15.12
        10:1      5.12
        5:1       0.12
        0.1:1     0.02
        0.02:1    0
         */

        double[] einheiten = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        double betrag = 888.88;
        for (double eineE : einheiten){
            int anzahl = (int) (betrag / eineE);
            if (anzahl != 0){
                System.out.println(eineE + ": " + anzahl);
                betrag -= anzahl * eineE;
                System.out.println("Restbetrag: " + betrag);
            }
        }




        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Geldbetrag eingeben");
        double betrag = Double.parseDouble(in.nextLine());
        for(double e : einheiten) {
            int s = (int) (betrag / e);
            if(s > 0) {
                System.out.println(s + " Stück " + e);
                betrag -= s * e;
                System.out.println("Restbetrag " + betrag);
            }
        }

         */
    }
}
