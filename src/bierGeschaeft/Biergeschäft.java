package bierGeschaeft;



public class Biergeschäft {

    private String geschäftsName;
    private Flaschenbier[] fb;
    private Dosenbier[] db;
    private Fass[] faesser;
    private double umsatz = 0;


    public Biergeschäft(String gn, int anzahlFb, int anzahlDb, int anzahlFass) {
        geschäftsName = gn;
        fb = new Flaschenbier[anzahlFb];
        db = new Dosenbier[anzahlDb];
        faesser = new Fass[anzahlFass];
    }

    public boolean einkaufen(Bier b) {
        if (b instanceof Flaschenbier) {
            legen(fb, b);
        } else if (b instanceof Dosenbier) {
            legen(db, b);
        } else if (b instanceof Fass) {
        legen(faesser, b);
        }
        return false;


        /*
        if(b instanceof Flaschenbier){
            for(int i = 0; i < fb.length; i++) {
                if (fb[i] == null) {
                    fb[i] = (Flaschenbier) b;
                    return true;
                }
            }
            return false;
        }
        else if(b instanceof Dosenbier){
            for(int i = 0; i < db.length; i++) {
                if (db[i] == null) {
                    db[i] = (Dosenbier) b;
                    return true;
                }
            }
            return false;
        }
        else if(b instanceof Fass){
            for(int i = 0; i < faesser.length; i++) {
                if (faesser[i] == null) {
                    faesser[i] = (Fass) b;
                    return true;
                }
            }
            return false;
        }
        return false;

         */

    }

    public boolean legen (Bier[] arr, Bier b) {
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = b;
                return true;
            }
        }
        return false;
    }

    public boolean verkaufen(Bier b) {

        if (b instanceof Flaschenbier) {
            return geben(fb, b);
        } else if (b instanceof Dosenbier) {
            return geben(db, b);
        } else if(b instanceof Fass) {
        return geben(faesser, b);

        }
        return false;

        /*
        if(b instanceof Flaschenbier){
            for(int i = 0; i < fb.length; i++) {
                if (fb[i] == b) {
                    fb[i] = null;
                    umsatz += b.getPreis();
                    return true;
                }
            }
            return false;
        }
        else if(b instanceof Dosenbier){
            for(int i = 0; i < db.length; i++) {
                if (db[i] == b) {
                    db[i] = null;
                    umsatz += b.getPreis();
                    return true;
                }
            }
            return false;
        }
        else if(b instanceof Fass){
            for(int i = 0; i < faesser.length; i++) {
                if (faesser[i] == b) {
                    faesser[i] = null;
                    umsatz += b.getPreis();
                    return true;
                }
            }
            return false;
        }
        return false;

         */

    }

    public boolean geben (Bier[] arr, Bier b) {
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == b) {
                arr[i] = null;
                umsatz += b.getPreis();
                return true;
            }
        }
        return false;
    }

    public double gesamtMenge() {
        int anzahl = 0;
        for(Bier einFb : fb) {
            if(einFb != null) {
                anzahl++;
            }
        }
        double gesamtFb = anzahl* 0.5;
        anzahl = 0;

        for(Bier eineDb : db) {
            if(eineDb != null) {
                anzahl++;
            }
        }
        double gesamtDb = anzahl* 0.25;

        double gesamtF = 0;


        for(Fass einF : faesser){
            if (einF != null){
               gesamtF += einF.getFuellmenge();
            }
        }
        return gesamtFb + gesamtDb + gesamtF;
    }

    public void drucken() {

        System.out.println("\nLagerbestand des Biergeschäfts " + geschäftsName);
        System.out.println("\nFlaschenbiere: ");

        for(Flaschenbier fb : fb) {
            if (fb != null) {
                fb.drucken();
            }
        }

        System.out.println("\nDosenbiere: ");

        for(Dosenbier db : db) {
          if (db != null) {
              db.drucken();
          }
      }
        System.out.println("\nFaesser: ");

        for(Fass fass : faesser) {
          if (fass != null) {
              fass.drucken();
          }
      }
        System.out.println("\nGesamtmenge an Liter: " + gesamtMenge() + " l");
        System.out.println("Umsatz vom Geschäft: " + umsatz);
    }
}
