package t1K7;

public class Strecke {

    private Punkt p;
    private Punkt q;

    public Strecke(Punkt p, Punkt q){
        this.p = p;
        this.q= q;
    }

    public double berechneLaenge(){
        return Math.sqrt((Math.pow(q.getX() - p.getX(), 2)) + Math.pow(q.getY() - p.getY(), 2));
    }
}
