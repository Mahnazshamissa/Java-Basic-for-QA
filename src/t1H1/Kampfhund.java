package t1H1;

public class Kampfhund extends Hund{
    public Kampfhund(String n, int a, double g) {
        super(n, a, g);
    }

    @Override
    public double steuer() {
        return super.steuer() * 4;
    }
}
