package t1H0;

public class Sattelschlepper extends LKW{
    private int volumen;


    public Sattelschlepper(int b, String h, int v) {

        // Aufruf des passenden Kontruktors in der Superklasse
        super(b, h);
        volumen = v;
    }

    // überschreiben der Methode drucken, die aus der Superklasse vererbt wurdw

    @Override
    public void drucken(){
        System.out.println("\nSattelschlepper");

        // Aufruf der drucken Methode aus der Superklasse
        super.drucken();
        System.out.println("Volumen: " + volumen);

    }
}
