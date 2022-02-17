package t1A5;

public class T1A5 {
    public static void main(String[] args) {
        // Fibonacci
        /*
        0  1  1  2  3  5  8  13  21  34  ...
         */

        int[] fibo = new int[30];
        fibo[0] = 0 ;  // nicht unbedingt notwendig, da 0 type spezifischer Defaultwert
        fibo[1] = 1 ;

        // Durch das Array durchlaufen, beginnend mit Index 2

        for (int i = 2 ; i < fibo.length; i++){
            // nächste Fibonacci Zahl berechnen und in das Array eintragen
            fibo[i] = fibo[i - 1] + fibo [i - 2];
            System.out.println(fibo[i]);
        }

    }
}
