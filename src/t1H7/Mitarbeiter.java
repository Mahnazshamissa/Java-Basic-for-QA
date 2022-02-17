package t1H7;

public abstract class Mitarbeiter {

    private String personalNr;
    private String name;
    private String addresse;
    private int eintrittsjahr;
    private double stundenlohn;

    public Mitarbeiter(String personalNr, String name, String addresse, int eintrittsjahr, double stundenlohn) {
        this.personalNr = personalNr;
        this.name = name;
        this.addresse = addresse;
        this.eintrittsjahr = eintrittsjahr;
        this.stundenlohn = stundenlohn;
    }

    public double monatsgehaltBerechnen() {
        return stundenlohn * 154;
    }

    public String getPersonalNr() {
        return personalNr;
    }

    public void setPersonalNr(String personalNr) {
        this.personalNr = personalNr;
    }
    public void drucken() {
        System.out.println("Personalnummer: " + personalNr);
        System.out.println("Name: " + name);
        System.out.println("Addresse: " + addresse);
        System.out.println("Eintrittsjahr: " + eintrittsjahr);
        System.out.println("Stundenlohn: " + stundenlohn);
    }
}
