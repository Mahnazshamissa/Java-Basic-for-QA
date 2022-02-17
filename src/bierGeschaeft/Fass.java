package bierGeschaeft;

public class Fass extends Bier{

    private int fuellmenge;

    public Fass(String name, double prozent, double preis, int fuellmenge) {
        super(name, prozent, preis);
        this.fuellmenge = fuellmenge;
    }

    public int getFuellmenge() {
        return fuellmenge;
    }

    @Override
    public void drucken (){
        super.drucken();
        System.out.println("Füllmenge: " + fuellmenge);
        //System.out.println("Füllmenge: " + this.getFuellmenge());
    }
}
