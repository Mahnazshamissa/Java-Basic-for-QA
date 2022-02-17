package t1H0;

public class LKW {

    private int baujahr;
    private String hersteller;

    public LKW(int b, String h) {
        this.baujahr = b;
        this.hersteller = h;
    }

    public void drucken(){
        System.out.println("Baujahr: " + baujahr);
        System.out.println("Hersteller: " + hersteller);

    }
}
