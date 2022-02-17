package baecker;

public abstract class Produkte {

    private String name;
    private double verkaufspreis;
    private double herstellungspreis;
    private int backzeit;

    public Produkte(String name, double verkaufspreis, double herstellungspreis, int backzeit) {
        this.name = name;
        this.verkaufspreis = verkaufspreis;
        this.herstellungspreis = herstellungspreis;
        this.backzeit = backzeit;
    }



    public String getName() {
        return name;
    }



    public double getVerkaufspreis() {
        return verkaufspreis;
    }



    public double getHerstellungspreis() {
        return herstellungspreis;
    }



    public int getBackzeit() {
        return backzeit;
    }



    public void drucken() {
        System.out.println("Name: " + name);
        System.out.println("\tPreis: " + verkaufspreis);
        System.out.println("\tHerstellungspreis: " + herstellungspreis);
        System.out.println("\tBackzeit: " + backzeit);
    }

}
