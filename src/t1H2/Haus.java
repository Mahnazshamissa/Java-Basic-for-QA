package t1H2;

public class Haus {

    private Geraet[] geraete = new Geraet[20];

    public void urlaub() {
        for(Geraet g : geraete) {
            if(g != null) {
                g.aus();
            }
        }
    }

    public boolean aufnehmen(Geraet g) {
        for(int i = 0; i < geraete.length; i++) {
            if(geraete[i] == null) {
                geraete[i] = g;
                return true;
            }
        }
        return false;
    }

    public void drucken() {
        for(Geraet g : geraete) {
            if(g != null) {
                g.drucken();
            }
        }
    }

}
