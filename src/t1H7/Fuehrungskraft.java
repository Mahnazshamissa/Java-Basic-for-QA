package t1H7;

public abstract class Fuehrungskraft extends Mitarbeiter {

    private double bonus;

    public Fuehrungskraft(String personalNr, String name, String addresse, int eintrittsjahr, double stundenlohn, double bonus) {
        super(personalNr, name, addresse, eintrittsjahr, stundenlohn);
        this.bonus = bonus;
    }
}
