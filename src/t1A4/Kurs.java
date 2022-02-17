package t1A4;

public class Kurs {

    private String name;
    private double preis;

    // alle Elemente sind auf null initialisiert
    private String[] teilnehmer = new String[10]; //Definition schon in Array gemacht

    //Konstruktor
    public Kurs(String n, double p) {
        name = n;
        preis = p;
    }

    //Methoden zum :
    // Hinzufügen (aufnehmen,anmelden) und
    // Entfernen (stornieren) von Kursteilnehmern
    // Drucken

    public boolean anmelden(String teilnehmerName) {

        // durch das teilnehmer Array durchlaufen
        for(int i = 0; i < teilnehmer.length; i++) {

            // ist der Platz im Array frei
            if(teilnehmer[i] == null) {
                // ja,Platz ist frei und Element ist noch leer, Teilnehmer ins Array eintragen
                teilnehmer[i] = teilnehmerName;
                //fertig
                return true;
            }
        }

        // kein Platz frei
        return false;
    }


    public boolean stornieren(String teilnehmerName) {

        // durch das teilnehmer Array durchlaufen
        for(int i = 0; i < teilnehmer.length; i++) {

            // ist der Platz im Array besetzt  && ist das der gesuchte Teilnehmer
            if(teilnehmer[i] != null && teilnehmer[i].equals(teilnehmerName)) {

                // Platz ist wieder frei (Platz im Array frei machen)
                teilnehmer[i] = null;

                // fertig
                return true;
            }
        }

        // Teilnehmer wurde nicht gefunden
        return false;
    }


    public void drucken() {
        System.out.println(name + " zum Preis von " + preis + " Euro");
        System.out.println("Folgende Teilnehmer sind angemeldet");
        for(String einT : teilnehmer) {
            if(einT != null) {
                System.out.println(einT);
            }

        }
        System.out.println("----------------------");

    }

}
