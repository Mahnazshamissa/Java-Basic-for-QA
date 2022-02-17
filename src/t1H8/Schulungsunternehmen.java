package t1H8;

public class Schulungsunternehmen {

    private Schulung[] schulungen = new Schulung[10];

    public int aufnehmen(Schulung... sch) {
        int anzahl = 0;
        for(Schulung eineSch : sch) {
            for(int i = 0; i < schulungen.length; i++) {
                if(schulungen[i] == null) {
                    schulungen[i] = eineSch;
                    anzahl++;
                    break;
                }
            }
        }
        return sch.length - anzahl;
    }

    public void drucken() {
        for(Schulung eineSch : schulungen) {
            if(eineSch != null) {
                eineSch.drucken();
            }
        }
        System.out.println("\nGesamter erzielter Umsatz: " + umsatz());
        System.out.println("Gesamter erzielter Gewinn: " + gewinn());

    }

    public double umsatz() {
        double gesamtU = 0;
        for(Schulung eineSch : schulungen) {
            if(eineSch != null) {
                gesamtU += eineSch.umsatz();
            }
        }
        return gesamtU;
    }
    public double gewinn() {
        double gesamtG = 0;
        for(Schulung eineSch : schulungen) {
            if(eineSch != null) {
                gesamtG += eineSch.gewinn();
            }
        }
        return gesamtG;
    }

}
