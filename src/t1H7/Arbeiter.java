package t1H7;

public class Arbeiter extends Mitarbeiter {
    private double schichtzulage;

    public Arbeiter(String personalNr, String name, String addresse, int eintrittsjahr, double stundenlohn, double schichtzulage) {
        super(personalNr, name, addresse, eintrittsjahr, stundenlohn);
        this.schichtzulage = schichtzulage;
    }
}
