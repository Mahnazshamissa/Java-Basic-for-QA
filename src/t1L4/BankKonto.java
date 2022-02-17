package t1L4;

public class BankKonto {

    //Instanzvariablen
    private double kontostand;
    private double ueRahmen;

    //Konstruktor
    public BankKonto(double k, double ue) {
        kontostand = k;
        ueRahmen = ue;
    }

    //Methoden
    public void einzahlen(double betrag) {
        kontostand = kontostand + betrag;
    }
    public boolean abheben(double betrag) {
//		boolean y = true;
//		boolean n = false;
        if(kontostand - betrag >= ueRahmen) {
            kontostand = kontostand - betrag;
            return true;
        }
        else {
            return false;
        }
    }
    public double getKontoStand() {
        return  kontostand;
    }



}
