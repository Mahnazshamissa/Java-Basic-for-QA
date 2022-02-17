package bierGeschaeft;

public abstract class KleinBier extends Bier{
    private int anzahl;

    public KleinBier(String name, double prozent, double preis, int anzahl) {
        super(name, prozent, preis);
        this.anzahl = anzahl;
    }

    public int getAnzahl() {
        return anzahl;
    }

    @Override
    public void drucken (){
        super.drucken();
        System.out.println("Anzahl: " + anzahl);
        //System.out.println("Anzahl: " + this.getAnzahl());
    }
}
