package t1A13;

public class Fahrrad {
    private String inventarNummer;
    private String modell;
    private double einkaufPreis;
    private double verkaufsPreis;

    public Fahrrad (String i, String m, double ep, double vp) {
        inventarNummer = i;
        modell = m;
        einkaufPreis = ep;
        verkaufsPreis = vp;

    }
    public String getInventarNummer(){
        return inventarNummer;
    }

    public double getEinkaufPreis() {
        return einkaufPreis;
    }

    public double getVerkaufsPreis() {
        return verkaufsPreis;
    }

    public void drucken () {
        System.out.println();
    }


}
