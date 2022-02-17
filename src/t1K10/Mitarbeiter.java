package t1K10;

public class Mitarbeiter {

    private String Vorname;
    private String Nachname;
    private double Monatgehalt;

    public Mitarbeiter(String vorname, String nachname, double monatgehalt) {
        Vorname = vorname;
        Nachname = nachname;
        Monatgehalt = monatgehalt;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public double getMonatgehalt() {
        return Monatgehalt;
    }

    public void setMonatgehalt(double monatgehalt) {
        Monatgehalt = monatgehalt;
    }

    public void drucken(){
        System.out.println("Mitarbeiter " + getVorname()+ " "+ getNachname() + " hat einem Monatsgehalt von " + getMonatgehalt());
    }
/*
    public double jahresgehaltRechnen(double monatgehalt){
        return monatgehalt*14;
    }

 */
}
