package baecker;

public class Baguette extends Produkte{

    int groesse;

    public Baguette(String name, double verkaufspreis, double herstellungspreis, int backzeit, int groesse) {
        super(name, verkaufspreis, herstellungspreis, backzeit);
        this.groesse = groesse;
    }


    public int getGroesse() {
        return groesse;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("\tGroesse: " + groesse + " cm");
    }

}
