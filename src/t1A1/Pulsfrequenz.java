package t1A1;

import java.time.Year;

public class Pulsfrequenz {

    private String vorname;
    private String nachname;
    private int gdJahr;

    public Pulsfrequenz(String v, String n, int j) {
        this.vorname = v;
        this.nachname = n;
        this.gdJahr = j;
    }

    public int maxFrequenz() {
        // return (int) (223 - (2022 - gdJahr) * 0.9);
        return (int) (223 - (Year.now().getValue() - gdJahr) * 0.9);
    }

    public int[] zielFrequenz(){

        // Array mit 2 Elementen vorbereiten
        int[] zf = new int[2];

        // Array Elemente mit Werten füllen
        zf[0] = maxFrequenz()/2;
        zf[1] = (int)(maxFrequenz()* 0.85);

        // Array als Ergebnis zurückliefern
        return zf;
    }

    public void drucken(){
        System.out.println(vorname +" " + nachname + " geboren " + gdJahr);
        System.out.println("Maximale Plusfrequenz: " + maxFrequenz());
        int[] zf = zielFrequenz();
        System.out.println("Zeilfrequenz von " + zf[0] + " bis " + zf[1]);
    }
}
