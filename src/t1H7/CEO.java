package t1H7;

public class CEO extends Fuehrungskraft{

    private double optionen;

    public CEO(String personalNr, String name, String addresse, int eintrittsjahr, double stundenlohn, double bonus, double optionen) {
        super(personalNr, name, addresse, eintrittsjahr, stundenlohn, bonus);
        this.optionen = optionen;
    }

    @Override
    public double monatsgehaltBerechnen() {
        return super.monatsgehaltBerechnen() + optionen;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Optionen: " + optionen);
    }
}
