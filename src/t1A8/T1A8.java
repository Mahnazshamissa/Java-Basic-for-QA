package t1A8;

import java.util.Random;

public class T1A8 {
    public static void main(String[] args) {
        int[] lotto = new int[7];
        Random random = new Random();
        for(int i = 0; i < lotto.length; i++) {
            // Lottozahl ziehen
            lotto[i] = random.nextInt(45) + 1;
            // alle bisher gezogenen Zahlen auf Duplikat mit der neuen Zahl prüfen
            for(int j = 0; j < i; j++) {
                if(lotto[j] == lotto[i]) {
                    // die Zahl wurde bereits gezogen ( zuletzt gezogene Zahl verwerfen)
                    i--;
                    break;  // beendet die j Schleife
                }
            }
        }
        for(int eineLz : lotto) {
            System.out.println(eineLz);
        }
    }

}
