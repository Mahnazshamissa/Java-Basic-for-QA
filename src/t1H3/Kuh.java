package t1H3;

public class Kuh extends Nutztier{
    private double milchertrag;

    public Kuh(int a, String ff, String n, double me) {
        super(a, ff, n);
        this.milchertrag = me;
    }

    @Override
    public void gibLaut() {
        System.out.println("Muuuh");

    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Milchertrag: " + milchertrag);
    }


}
