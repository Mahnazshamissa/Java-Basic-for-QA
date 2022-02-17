package t1H4;

public abstract class Schallplatte extends Tontraeger{
    private int rpm;

    public Schallplatte(String genre, String interpret, String albumtitel, int jahr, int rpm) {
        super(genre, interpret, albumtitel, jahr);
        this.rpm = rpm;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Umdrehungen: " + rpm);
    }
}
