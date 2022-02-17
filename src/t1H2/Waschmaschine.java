package t1H2;

public class Waschmaschine extends Geraet{

    private int umdrehungen;

    public Waschmaschine(boolean st, int u) {
        super(st);
        this.umdrehungen = u;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Umdrehungen: " + umdrehungen);
    }
}
