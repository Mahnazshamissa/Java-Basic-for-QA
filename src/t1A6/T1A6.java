package t1A6;

import java.util.Scanner;

public class T1A6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double [] sparbuch = new double[10];

        System.out.println("Bitte geben Sie Ihr Sparguthaben ein: ");
         sparbuch [0] = Double.parseDouble(in.nextLine());

        System.out.println("Bitte geben Sie Ihren Zinssatz ein: ");
        double zs = Double.parseDouble(in.nextLine());


        for (int i = 1 ; i < sparbuch.length ; i++ ){

            sparbuch [i] = sparbuch [ i - 1] * ( 1 + zs/100);
        }

        for (double kontostand : sparbuch) {
            System.out.format( "Kontostand : %.2f\n " , kontostand);
        }



    }
}
