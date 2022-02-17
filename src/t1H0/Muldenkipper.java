package t1H0;

public class Muldenkipper extends LKW{
    private double beladung;


    public Muldenkipper(int b, String h, double bel) {
        super(b, h);
        beladung = bel;
    }

    // überschreiben der Methode drucken, die aus der Superklasse vererbt wurde

    @Override
    public void drucken(){

        System.out.println("\nMuldenkipper");

        // Aufruf der drucken Methode aus der Superklasse
        super.drucken();
        System.out.println("Beladung: " + beladung);

    }
}
