package t1aKH19;


import t1H8.Kursteilnehmer;

public class Marina {
    private String name = "Marina";
    private Runderboot[] rb;
    private Segelboot[] sb;
    private Motorboot[] mb;
/*
    public Marina(String n, Runderboot[] rb, Segelboot[] sb, Motorboot[] mb) {
        this.name = n;
        this.rb = rb;
        this.sb = sb;
        this.mb = mb;
    }

 */
    public Marina(String n, int anzahlRB, int anzahlSB, int anzahlMB) {
        this.name = n;
        rb = new Runderboot[anzahlRB];
        sb = new Segelboot[anzahlSB];
        mb = new Motorboot[anzahlMB];
    }

    public boolean anlegen(Boot b) {
        if(b instanceof Runderboot){
            for(int i = 0; i < rb.length; i++) {
                if (rb[i] == null) {
                    rb[i] = (Runderboot) b;
                    return true;
                }
            }
            return false;
        }
        else if(b instanceof Segelboot){
            for(int i = 0; i < sb.length; i++) {
                if (sb[i] == null) {
                    sb[i] = (Segelboot) b;
                    return true;
                }
            }
            return false;
        }
        else if(b instanceof Motorboot){
            for(int i = 0; i < mb.length; i++) {
                if (mb[i] == null) {
                    mb[i] = (Motorboot) b;
                    return true;
                }
            }
            return false;
        }
        return false;

    }


    public boolean entfernen(Boot b) {
        if(b instanceof Runderboot){
            for(int i = 0; i < rb.length; i++) {
                if (rb[i] == b) {
                    rb[i] = null;
                    return true;
                }
            }
            return false;
        }
        else if(b instanceof Segelboot){
            for(int i = 0; i < sb.length; i++) {
                if (sb[i] == b) {
                    sb[i] = null;
                    return true;
                }
            }
            return false;
        }
        else if(b instanceof Motorboot){
            for(int i = 0; i < mb.length; i++) {
                if (mb[i] == b) {
                    mb[i] = null;
                    return true;
                }
            }
            return false;
        }
        return false;

    }


    public void wertsteigerung(int prozentRuderboot, int prozentSegelboot, int prozentMotorboot) {
        for (Runderboot einRb : rb){
            if (einRb != null)
                einRb.setWert(einRb.getWert()*(1+prozentRuderboot/100d));
        }
        for (Segelboot einSb : sb){
            if (einSb != null)
                einSb.setWert(einSb.getWert()*(1+prozentSegelboot/100d));
        }
        for (Motorboot einMb : mb){
            if (einMb != null)
                einMb.setWert(einMb.getWert()*(1+prozentMotorboot/100d));
        }

    }


    public void drucken() {
        System.out.println("Boot: " + name + " mit ");
        int anzahlRB = 0;
        double wertRB = 0;

        for(Runderboot rb : rb) {
            if(rb != null) {
                rb.drucken();
                anzahlRB++;
                wertRB += rb.getWert();

            }
        }
        System.out.println("Anzahl der Ruderboote: " + anzahlRB);
        System.out.println("Gesamtwert der Ruderboote: " + wertRB);

        int anzahlSB = 0;
        double wertSB = 0;
        for(Segelboot sb : sb) {
            if(sb != null) {
                sb.drucken();
                anzahlSB++;
                wertSB += sb.getWert();
            }
        }
        System.out.println("Anzahl der Segelboote: " + anzahlSB);
        System.out.println("Gesamtwert der Segelboote: " + wertSB);

        int anzahlMB = 0;
        double wertMB = 0;
        for(Motorboot mb : mb) {
            if(mb != null) {
                mb.drucken();
                anzahlMB++;
                wertMB += mb.getWert();
            }
        }

        System.out.println("Anzahl der Motorboote: " + anzahlMB);
        System.out.println("Gesamtwert der Motorboote: " + wertMB);

    }

}
