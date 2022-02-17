package t1aKH19;

public abstract class Boot {

    private String modellname;
    private String besitzername;
    private double wert;

    public Boot(String mn, String bn, double w) {
        this.modellname = mn;
        this.besitzername = bn;
        this.wert = w;
    }

    public String getModellname() {
        return modellname;
    }

    public void setModellname(String modellname) {
        this.modellname = modellname;
    }

    public String getBesitzername() {
        return besitzername;
    }

    public void setBesitzername(String besitzername) {
        this.besitzername = besitzername;
    }

    public double getWert() {
        return wert;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    public void drucken() {
        System.out.println("\nBoote: " + this.getClass().getSimpleName() + "\nModellname: " + modellname + "\nBesitzername: " + besitzername + "\nAktueller Wert: " + wert + " €");
    }

}
