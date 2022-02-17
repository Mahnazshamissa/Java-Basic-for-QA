package t1H3;

public class Pferd extends Nutztier{
    private int zuglast;

    public Pferd(int a, String ff, String n, int zl) {
        super(a, ff, n);
        this.zuglast = zl;
    }

    @Override
    public void gibLaut() {
        System.out.println("Wihaaa");

    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Zuglast: " + zuglast);

    }

}
