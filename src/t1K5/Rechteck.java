package t1K5;

public class Rechteck {
    private int seiteA;
    private int seiteB;

    public Rechteck(int a, int b) {
        this.seiteA = a;
        this.seiteB = b;
    }

    public int getSeiteA() {
        return this.seiteA;
    }

    public int getSeiteB() {
        return this.seiteB;
    }

    public int umfang() {
        return 2 * (this.seiteA + this.seiteB);
    }

    public int flaeche() {
        return this.seiteA * this.seiteB;
    }
}
