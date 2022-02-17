package t1H1;

public abstract class Hund {
    private String name;
    private int alter;
    private double gewicht;

    public Hund(String n, int a, double g) {
        name = n;
        alter = a;
        gewicht = g;
    }

    public double steuer() {
        return gewicht * 3.5;
    }

    public void drucken() {
        System.out.println("\n" + this.getClass().getSimpleName());
        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter);
        System.out.println("Gewicht: " + gewicht);
        System.out.format("Hundesteuer: %.2f\n", steuer());
    }

}
