package baecker;

public class Bäcker {

    private String name;
    private Baguette[] bg;
    private Bauernbrot[] bb;
    private Apfelkuchen[] ak;
    private VeganerKuchen[] vk;
    double gesamtherstellungskosten = 0;
    double gesamtumsatz = 0;

    public Bäcker(String name, int bg, int bb, int ak, int vk) {
        this.name = name;
        this.bg = new Baguette[bg];
        this.bb = new Bauernbrot[bb];
        this.ak = new Apfelkuchen[ak];
        this.vk = new VeganerKuchen[vk];
    }


    public boolean backen(Produkte...pro) {
        for(Produkte einP : pro) {
            if(einP instanceof Baguette) {
                for (int i = 0 ; i<bg.length ; i++) {
                    if (bg[i] == null) {
                        bg[i] = (Baguette) einP;
                        gesamtherstellungskosten += bg[i].getHerstellungspreis();
                        break;
                    }
                }
            }
            if(einP instanceof Bauernbrot) {
                for (int i = 0 ; i<bb.length ; i++) {
                    if (bb[i] == null) {
                        bb[i] = (Bauernbrot) einP;
                        gesamtherstellungskosten += bb[i].getHerstellungspreis();
                        break;
                    }
                }
            }
            if(einP instanceof Apfelkuchen) {
                for (int i = 0 ; i<ak.length ; i++) {
                    if (ak[i] == null) {
                        ak[i] = (Apfelkuchen) einP;
                        gesamtherstellungskosten += ak[i].getHerstellungspreis();
                        break;
                    }
                }
            }
            if(einP instanceof VeganerKuchen) {
                for (int i = 0 ; i<vk.length ; i++) {
                    if (vk[i] == null) {
                        vk[i] = (VeganerKuchen) einP;
                        gesamtherstellungskosten += vk[i].getHerstellungspreis();
                        break;
                    }
                }
            }
        }
        return false;
    }




    public boolean verkaufen(Produkte...pro) {

        for(Produkte einP : pro) {
            if(einP instanceof Baguette) {
                for (int i = 0 ; i<bg.length ; i++) {
                    if ((Baguette) einP == bg[i]) {
                        gesamtumsatz += bg[i].getVerkaufspreis();
                        bg[i] = null;
                        break;
                    }
                }
            }
            if(einP instanceof Bauernbrot) {
                for (int i = 0 ; i<bb.length ; i++) {
                    if ((Bauernbrot) einP == bb[i]) {
                        gesamtumsatz += bb[i].getVerkaufspreis();
                        bb[i] = null;
                        break;
                    }
                }
            }
            if(einP instanceof Apfelkuchen) {
                for (int i = 0 ; i<ak.length ; i++) {
                    if ((Apfelkuchen) einP == ak[i]) {
                        gesamtumsatz += ak[i].getVerkaufspreis();
                        ak[i] = null;
                        break;
                    }
                }
            }
            if(einP instanceof VeganerKuchen) {
                for (int i = 0 ; i<vk.length ; i++) {
                    if ((VeganerKuchen) einP == vk[i]) {
                        gesamtumsatz += vk[i].getVerkaufspreis();
                        vk[i] = null;
                        break;
                    }
                }
            }
        }
        return false;
    }


    public int getMaxBackzeit() {

        int maxbackzeit= 0;
        for (int i = 0 ; i < bg.length ; i++) {
            if(bg[i] != null) {
                if(bg[i].getBackzeit() > maxbackzeit) {
                    maxbackzeit = bg[i].getBackzeit();
                }
            }
        }
        for (int i = 0 ; i < bb.length ; i++) {
            if(bb[i] != null) {
                if(bb[i].getBackzeit() > maxbackzeit) {
                    maxbackzeit = bb[i].getBackzeit();
                }
            }
        }
        for (int i = 0 ; i < ak.length ; i++) {
            if(ak[i] != null) {
                if(ak[i].getBackzeit() > maxbackzeit) {
                    maxbackzeit = ak[i].getBackzeit();
                }
            }
        }
        for (int i = 0 ; i < vk.length ; i++) {
            if(vk[i] != null) {
                if(vk[i].getBackzeit() > maxbackzeit) {
                    maxbackzeit = vk[i].getBackzeit();
                }
            }
        }


        return maxbackzeit;

    }

    public void drucken() {
        System.out.println("Name der Baeckerei: " + name);
        System.out.format("\tHerstellungskosten: %.2f\n" , gesamtherstellungskosten);
        System.out.format("\tUmsatz: %.2f\n", gesamtumsatz);
        System.out.format("\tGewinn: %.2f\n", (gesamtumsatz-gesamtherstellungskosten));
        System.out.println("\tDie Backzeit beträgt: " + getMaxBackzeit());
        System.out.println("Es gibt folgende Produkte: ");

        for(Bauernbrot einBb : bb) {
            if(einBb != null) {
                einBb.drucken();
            }
        }
        for(Baguette einBg : bg) {
            if(einBg != null) {
                einBg.drucken();
            }
        }
        for(Apfelkuchen einAk : ak) {
            if(einAk != null) {
                einAk.drucken();
            }
        }
        for(VeganerKuchen einVk : vk) {
            if(einVk != null) {
                einVk.drucken();
            }
        }
    }

}
