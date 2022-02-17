package t1H3;

public class Katze extends Haustier{
    public Katze(int a, String ff, String n, String ft) {
        super(a, ff, n, ft);
    }


    @Override
    public void gibLaut() {
        System.out.println("Miau");

    }
}
