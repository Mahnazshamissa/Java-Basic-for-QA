package t1A11;

public class Ware {
    private String artikelNummer;
    private String artikelBezeichnung;
    private double preis;

    public Ware(String an, String ab, double p) {
        artikelNummer = an;
        artikelBezeichnung = ab;
        preis = p;
    }

    public String getArtikelNummer() {
        return artikelNummer;
    }

    public String getArtikelBezeichnung() {
        return artikelBezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    @Override
    public String toString() {
        /*
        return "Ware{" +

                "artikelNummer='" + artikelNummer + '\'' +
                ", artikelBezeichnung='" + artikelBezeichnung + '\'' +
                ", preis=" + preis +
                '}';

         */

       // return artikelNummer + "\t" + artikelBezeichnung + "\t" + preis;

        // %s : String an dieser Stelle einsetzen
        return String.format("%s \t %s \t %.2f", artikelNummer , artikelBezeichnung , preis);
    }

}
