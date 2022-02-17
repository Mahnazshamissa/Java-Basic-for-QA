package t1H6;

public abstract class Elektonicherad extends Zweirad{

    private int anzahlPS;
    private String motortype;

    public Elektonicherad(String modellname, int anzahlPS, String motortype) {
        super(modellname);
        this.anzahlPS = anzahlPS;
        this.motortype = motortype;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Anzahl PS: " + anzahlPS);
        System.out.println("Motortyp: " + motortype);
    }
}
