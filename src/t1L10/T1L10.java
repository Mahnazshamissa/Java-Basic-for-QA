package t1L10;

import java.util.Random;

public class T1L10 {
    public static void main(String[] args) {
        Random random = new Random();
        int anzahl = random.nextInt(20) + 1;
        for(int i = 1; i <= anzahl; i++) {

            // nextInt(26) : 0 bis 25 inklusive
            //'A' : 65
            // (0 bis 25) + 65 --> 65 bis 90

            char grossB = (char) (random.nextInt(26) + 'A');
            if(grossB == 'A' || grossB == 'E' || grossB == 'I' || grossB == 'O'|| grossB == 'U') {

                // Vokal, daher ignorieren
            }
            else {
                System.out.print(grossB);
            }
        }
    }

}
