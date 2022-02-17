package t1H5;

public abstract class PKW extends Kraftfahrzeug {

    private int passagiere;

    public PKW(String modellname, int leistung, int baujahr, int passagiere) {
        super(modellname, leistung, baujahr);
        this.passagiere = passagiere;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Passagiere: " + passagiere);
    }

}
