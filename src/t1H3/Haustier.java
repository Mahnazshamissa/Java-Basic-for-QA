package t1H3;

public abstract class Haustier extends Tier{
    private String felltyp;

    public Haustier(int a, String ff, String n, String ft) {
        super(a, ff, n);
        this.felltyp = ft;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Felltyp: " + felltyp);
    }
}
