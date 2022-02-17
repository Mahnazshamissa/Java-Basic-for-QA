package baecker;

public abstract class Kuchen extends Produkte{
    private String inhalt;

    public Kuchen(String name, double verkaufspreis, double herstellungspreis, int backzeit, String inhalt) {
        super(name, verkaufspreis, herstellungspreis, backzeit);
        this.inhalt = inhalt;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("\tInhalt: " + inhalt);
    }

    public String getInhalt() {
        return inhalt;
    }
}
