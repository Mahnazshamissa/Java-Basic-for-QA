package t1K4;

public class Sparbuch {
    private double guthaben;

    public Sparbuch() {
    }

    public void einzahlen(double betrag) {
        this.guthaben += betrag;
    }

    public double endKaitalBerechnung(int laufzeit, double zinssatz) {
        return this.guthaben * Math.pow(1.0D + zinssatz / 100.0D, (double)laufzeit);
    }
}
