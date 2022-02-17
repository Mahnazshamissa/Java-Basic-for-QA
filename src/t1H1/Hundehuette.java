package t1H1;

public class Hundehuette {

    private Hund[] hunde;

    public Hundehuette(int anzahl) {
        this.hunde = new Hund[anzahl];
    }

    public boolean aufnehmen(Hund h) {
        for(int i = 0; i < hunde.length; i++) {
            if(hunde[i] == null) {
                hunde[i] = h;
                return true;
            }
        }
        return false;

    }

    public void drucken() {
        System.out.println("In der Hundehütte wohnen");
        int anzahlB = 0;
        int anzahlK = 0;
        int anzahlS = 0;
        double gesamtSteuer = 0;
        for(Hund einH : hunde) {
            if(einH != null) {
                einH.drucken();
                gesamtSteuer += einH.steuer();
                // bist du ein Blindenhund?
                if(einH instanceof Blindenhund)
                    // ja
                    anzahlB++;
                // kein Blindenhund, bist du ein Kampfhund
                else if(einH instanceof Kampfhund)
                    anzahlK++;
                else if(einH instanceof Schosshund)
                    anzahlS++;
            }
        }
        System.out.println("\nStatistik");
        System.out.println(anzahlB + " Blindenhunde");
        System.out.println(anzahlK + " Kampfhunde");
        System.out.println(anzahlS + " Schosshunde");
        System.out.println("Gesamte Hundesteuer: " + gesamtSteuer);
    }
}
