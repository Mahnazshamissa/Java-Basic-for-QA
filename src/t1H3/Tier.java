package t1H3;

public abstract class Tier {
    private int alter;
    private String fellfarbe;
    private String name;


    public Tier(int a, String ff, String n) {
        super();
        this.alter = a;
        this.fellfarbe = ff;
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public abstract void gibLaut();

    public void drucken() {
        System.out.println("\nTier: " + this.getClass().getSimpleName() + "\nName: " + name + "\nAlter: " + alter + "\nFellfarbe: " + fellfarbe);
    }

}
