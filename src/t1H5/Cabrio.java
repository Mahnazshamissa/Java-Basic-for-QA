package t1H5;

public class Cabrio extends PKW{
    private int verdeck;

    public Cabrio(String modellname, int leistung, int baujahr, int passagiere, int verdeck) {
        super(modellname, leistung, baujahr, passagiere);
        this.verdeck = verdeck;
    }


    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Verdeck: " + verdeck);
    }
}
