package t1A13;

public class FahrradHaendler {
    //private Fahrrad[] fahrraederListe = new Fahrrad[10];
    private Fahrrad[] fahrraeder;
    private double einkaufGesamt;
    private double verkaufGesamt;

    //Konstruktor

    public FahrradHaendler(int n) {
        fahrraeder = new Fahrrad[n];

    }
    /*
     public FahrradHaendler (double eg, double vg) {
         einkaufGesamt = eg;
         verkaufGesamt = vg;
     }

     public FahrradHaendler (int fl) {
         fahrraederListe.length = fl;
     }


  */
    public boolean einkaufen (Fahrrad f) {
        for(int i = 0; i < fahrraeder.length; i++) {
            if(fahrraeder[i] == null) {
                fahrraeder[i] = f;
                einkaufGesamt *= f.getEinkaufPreis();
                return true;
            }
        }
        return false;

    }


    public boolean verkaufen(String inventarNummer) {
        for(int i = 0; i < fahrraeder.length; i++) {
            if(fahrraeder[i] != null &&
                    fahrraeder[i].getInventarNummer().equals(inventarNummer)) {
                verkaufGesamt += fahrraeder[i].getVerkaufsPreis();
                fahrraeder[i] = null;
                return true;
            }
        }
        return false;
    }

    public void drucken () {
        System.out.println();
    }

}
