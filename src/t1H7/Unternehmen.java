package t1H7;

public class Unternehmen {

    private String name;
    private Mitarbeiter[] personal = new Mitarbeiter[30];

    public Unternehmen(String n) {
        this.name = n;
    }

    public boolean mitarbeiterAufnehmen(Mitarbeiter m) {
        for(int i = 0; i < personal.length; i++) {
            if(personal[i] == null) {
                // Element ist noch leer
                personal[i] = m;
                return true;
            }
        }
        return false;
    }

    public boolean mitarbeiterKuendigen(String personalNr) {
        for(int i = 0; i < personal.length; i++) {
            if(personal[i] != null && personal[i].getPersonalNr().equals(personalNr)) {
                personal[i] = null;
                return false;
            }
        }
        return true;
    }
    public double gesamtLohnKostenBerechnen() {
        double gesamtLohn = 0;
        for(Mitarbeiter mm : personal) {
            if(personal != null) {
                gesamtLohn += mm.monatsgehaltBerechnen();
            }
        }
        return gesamtLohn;

    }
    public void drucken() {
        for(Mitarbeiter mm : personal) {
            if(mm != null) {
                mm.drucken();
            }
        }
        System.out.println("Unternehmen: " + name);
        System.out.println("Gesamtlohnkosten: " + gesamtLohnKostenBerechnen());
    }

}
