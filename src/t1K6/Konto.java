package t1K6;

public class Konto {
    private String name;
    private double guthaben;
    private double ueberziehungsrahmen;

    public Konto(String n, double g, double ue){
        name=n;
        guthaben=g;
        ueberziehungsrahmen=ue;
    }
/*
    public String getName() {
        return name;
    }

    public double getGuthaben() {
        return guthaben;
    }

    public double getUeberziehungsrahmen() {
        return ueberziehungsrahmen;
    }
*/

    public double kontostand() {
        return guthaben;
    }

    public void einzahlen(double betrag){
        guthaben+= betrag;
    }

    public void auszahlen (double betrag){
        if (guthaben-betrag < ueberziehungsrahmen)
            System.out.println("Überziehungsrahmen überschritten");
        else guthaben-=betrag;
    }
}
