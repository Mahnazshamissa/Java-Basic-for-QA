package t1H5;

public abstract class LKW extends Kraftfahrzeug {
    private double nutzlast;

    public LKW(String modellname, int leistung, int baujahr, double nutzlast) {
        super(modellname, leistung, baujahr);
        this.nutzlast = nutzlast;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Nutzlast: " + nutzlast);
    }
}
