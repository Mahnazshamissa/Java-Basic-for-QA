package t1A9;

import java.util.Scanner;

public class T1A9 {
    public static void main(String[] args) {
        int[] mittelwert = new int[10];
        int summe = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 0 ; i < mittelwert.length ; i++ ){
            System.out.println("Bitte geben Sie ein Ganzenzahl ein: ");
            int gz = Integer.parseInt(in.nextLine());
            summe += gz ;
        }

        //System.out.format( "Arithmetische Mittel ist gleich: %.2f" , summe/10d);
        System.out.format( "Arithmetische Mittel ist gleich: %.2f" , (double)(summe/10d));



    }
}
