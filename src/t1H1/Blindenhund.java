package t1H1;

public class Blindenhund extends Hund{

    public Blindenhund(String n, int a, double g) {
        super(n, a, g);
    }

    @Override
    public double steuer() {
        return super.steuer() * 0.1;
    }
}
