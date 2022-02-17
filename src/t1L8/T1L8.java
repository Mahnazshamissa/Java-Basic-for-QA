package t1L8;

import java.util.Scanner;

public class T1L8 {
    public static void main(String[] args) {
        /*
        28

        28 % 2 == 0 --> 2

        28 / 2 = 14 % 2 == 0 --> 2

        14 / 2 = 7 % 2
        7 % 3
        7 % 4
        7 % 5
        7 % 6
        7% 7 == 0 --> 7

        7/ 7 = 1

         */

        Scanner in = new Scanner(System.in);
        System.out.println("Geben Sie eine ganze Zahl ein");
        int zahl = Integer.parseInt(in.nextLine());
        int primfaktor = 2;
        while (zahl != 1){
            if ( zahl % primfaktor == 0){
                System.out.println(primfaktor);
                zahl/= primfaktor;
            }
            else {
                primfaktor++;
            }
        }

    }
}
