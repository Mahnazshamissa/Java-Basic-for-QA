package t1H3;

public class Bauernhof {

    private Tier[] tier;
    //private Tier[] stall = new Tier[20];

    public Bauernhof(Tier[] t) {
        super();
        this.tier = t;
    }

    public Bauernhof(int anzahl) {
        tier = new Tier[anzahl];

    }

    public boolean aufnehmen(Tier t) {
        for(int i = 0; i < tier.length; i++) {
            if(tier[i] == null) {
                tier[i] = t;
                return true;
            }
        }
        return false;
    }

    public boolean verkaufen(String tierName) {
        for(int i = 0; i < tier.length; i++) {
            if(tier[i] != null && tier[i].getName().equals(tierName)) {
                tier[i] = null;
                return true;
            }
        }
        return false;
    }


    public void drucken() {
        for(Tier t : tier) {
            if(t != null) {
                t.drucken();
            }
        }

    }
}
