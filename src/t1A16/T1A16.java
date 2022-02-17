package t1A16;

public class T1A16 {

    public static void main(String[] args) {
        System.out.println(berechnen('+', 1, 2, 3, 4, 5));
        System.out.println(berechnen('*', 1, 2, 3, 4, 5));
        System.out.println(berechnen('+', 1, 2, 3));
        System.out.println(berechnen('*', 1, 2, 3));
        System.out.println(berechnen('+'));
        System.out.println(berechnen('*'));
    }

    // int... beschreibt eine variable Parameterliste
    //        beim Aufruf könne zwischne 0 bis n Werte mitgegeben werden
    // Parameter werte : wird als Array in der Methode zur Verfügung gestellt
    private static int berechnen(char operator , int... werte){
        int ergebnis = 0;
        if (operator == '*'){
            ergebnis = 1;
        }
        for (int einW : werte){
            if (operator == '+'){
                ergebnis += einW;
            }
            else {
                ergebnis *= einW;
            }
        }
        return ergebnis;

    }
}
