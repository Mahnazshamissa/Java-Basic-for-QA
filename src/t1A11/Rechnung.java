package t1A11;

public class Rechnung {

    private RechnungZeile[] zeilen;

    public Rechnung(int zeilenAnzahl) {
        zeilen = new RechnungZeile[zeilenAnzahl];

    }
    public boolean neueWare(Ware w, int anzahl) {
        // durch die Elemente des Array durchlaufen
        for(int i = 0; i < zeilen.length; i++) {
            // ist das Element frei?
            if(zeilen[i] == null) {
                // ja, neue Rechnungzeile anlegen
                zeilen[i] = new RechnungZeile(w, anzahl);
                // fertig
                return true;
            }
        }
        // rechnung ist voll, kein Platz frei
        return false;
    }
    public void drucken (){
        double gesamt = 0;
        for(RechnungZeile eineRz : zeilen) {
            if(eineRz != null) {
                System.out.println(eineRz.toString());
                gesamt += eineRz.getPreis() * eineRz.getAnzahl();
            }
        }
        System.out.format("\nGesamt\t %.2f\f" , gesamt);
    }

}
