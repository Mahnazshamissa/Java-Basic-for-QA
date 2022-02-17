package t1A11;

public class RechnungZeile {
    private Ware ware;
    private int anzahl;

    public RechnungZeile(Ware w, int a) {
        ware = w;
        anzahl = a;
    }

    public double getPreis() {
        return ware.getPreis();
        // return ware.getPreis() * anzahl;
    }
    public int getAnzahl() {
        return anzahl;
    }

    @Override
    public String toString() {
       /*
        return "RechnungZeile{" +

                "ware=" + ware +
                ", anzahl=" + anzahl +
                '}';

        */

        // return ware.toString() + "\tAnzahl " + anzahl + "\t" + (ware.getPreis() * anzahl);

        // %d : an dieser Stelle eine ganze Zahl (dezimaler Integer) einsetzen
        return String.format("%s \tAnzahl %d \t %.2f\n",ware.toString() , anzahl , (ware.getPreis() * anzahl));
    }
}
