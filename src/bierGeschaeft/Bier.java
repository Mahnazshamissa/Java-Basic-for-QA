package bierGeschaeft;

public abstract class Bier {

    private String name;
    private double prozent;
    private double preis;


    public Bier(String name, double prozent, double preis) {
        this.name = name;
        this.prozent = prozent;
        this.preis = preis;
    }

    public double getPreis() {
        return preis;
    }


    public void drucken (){
        System.out.println("Name: " + name);
        System.out.println("Prozent: " + prozent);
        System.out.println("Preis: " + preis);
        //System.out.println("Preis: " + this.getPreis());
    }
}
