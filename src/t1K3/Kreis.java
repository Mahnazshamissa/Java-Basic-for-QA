package t1K3;

public class Kreis {
    private int radius;

    public Kreis(int r) {
        this.radius = r;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public double umfang() {
        return (double)(2 * this.radius) * 3.141592653589793D;
    }

    public double flaeche() {
        return (double)(this.radius * this.radius) * 3.141592653589793D;
    }
}
