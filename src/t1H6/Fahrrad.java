package t1H6;

public abstract class Fahrrad extends Zweirad {

    private int anzahlGaenge;

    public Fahrrad(String modellname, int anzahlGaenge) {
        super(modellname);
        this.anzahlGaenge = anzahlGaenge;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Anzahl Gänge: " + anzahlGaenge);
    }
}
