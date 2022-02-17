package t1H8;

public class Schulung {
    private String titel;
    private double preis;
    private int tage;
    private Kursteilnehmer[] teilnehmer = new Kursteilnehmer[15];
    private Trainer trainer;

    public Schulung(String titel, double preis, int tage) {
        this.titel = titel;
        this.preis = preis;
        this.tage = tage;
    }

    /*
    // in eclipse steht in Konstruktor immer super() aber in IntelliJ gibt es nicht mehr
        public Schulung(String titel, double preis, int tage) {
            super();
            this.titel = titel;
            this.preis = preis;
            this.tage = tage;
        }

         */


    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
    public int anmelden(Kursteilnehmer... kt) {
        int anzahl = 0;
        for(Kursteilnehmer einKt : kt) {
            for(int i = 0; i < teilnehmer.length; i++) {
                if(teilnehmer[i] == null) {
                    teilnehmer[i] = einKt;
                    anzahl++;
                    break;
                }
            }
        }
        return kt.length - anzahl;
    }
    public int abmelden(Kursteilnehmer... kt) {
        int anzahl = 0;
        for(Kursteilnehmer einKt : kt) {
            for(int i = 0; i < teilnehmer.length; i++) {
                // if(teilnehmer[i] != null && teilnehmer[i] == einKt) {
                if(teilnehmer[i] == einKt) {
                    teilnehmer[i] = null;
                    anzahl++;
                    break;
                }
            }
        }
        return kt.length - anzahl;
    }

    public void drucken() {
        System.out.println("\nKurs " + titel);
        System.out.println("zum Preis von: " + preis);
        System.out.println("Kursdauer: " + tage + " Tage");
        System.out.println("Folgende Teilnehmer sind angemeldet");
        for(Kursteilnehmer einKt : teilnehmer) {
            if(einKt != null) {
                einKt.drucken();
            }
        }
        if(trainer != null) {
            System.out.println("Details des zugeordneten Trainers");
            trainer.drucken();
        }
        else {
            System.out.println("Noch kein Trainer zugeordnet");
        }
        System.out.println("Umsatz des Kurses: " + umsatz());
        System.out.println("Gewinn des Kurses: " + gewinn());
    }

    public double umsatz() {
        int anzahl = 0;
        for(Kursteilnehmer einKt : teilnehmer) {
            if(einKt != null) {
                anzahl++;
            }
        }
        return preis * anzahl;
    }
    public double gewinn() {
        double trainerKosten = 0;
        if(trainer != null) {
            trainerKosten = trainer.getTagsatz() * tage;
        }
        return umsatz() - trainerKosten;
    }



}
