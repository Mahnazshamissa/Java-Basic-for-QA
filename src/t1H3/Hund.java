package t1H3;

public class Hund extends Haustier{
    public Hund(int a, String ff, String n, String ft) {
        super(a, ff, n, ft);
    }


    @Override
    public void gibLaut() {
        System.out.println("Wuff");

    }
}
