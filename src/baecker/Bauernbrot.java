package baecker;

public class Bauernbrot extends Produkte{

    boolean geschnitten;

    public Bauernbrot(String name, double verkaufspreis, double herstellungspreis, int backzeit, boolean geschnitten) {
        super(name, verkaufspreis, herstellungspreis, backzeit);
        this.geschnitten = geschnitten;
    }

    @Override
    public void drucken() {
        super.drucken();
        if(geschnitten == true) {
            System.out.println("\tGeschnitten");
        }
        else System.out.println("\tNicht geschnitten");
    }

    public boolean isGeschnitten() {
        return geschnitten;
    }
}
