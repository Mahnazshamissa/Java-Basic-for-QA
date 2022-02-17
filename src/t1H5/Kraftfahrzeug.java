package t1H5;

public abstract class Kraftfahrzeug {

    private String modellname;
    private int leistung;
    private int baujahr;

    public Kraftfahrzeug(String modellname, int leistung, int baujahr) {
        this.modellname = modellname;
        this.leistung = leistung;
        this.baujahr = baujahr;
    }

    public void drucken() {
        System.out.println("\n" + this.getClass().getSimpleName());
        System.out.println("Modellname: " + modellname);
        System.out.println("Leistung: " + leistung);
        System.out.println("Baujahr: " + baujahr);
    }

}
