package t1H2;

public class Fernseher extends UGeraet{
    private int diagonale;

    public Fernseher(boolean st, String s, int l, int d) {
        super(st, s, l);
        diagonale = d;
    }

    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Diagonale: " + diagonale);
    }
}
