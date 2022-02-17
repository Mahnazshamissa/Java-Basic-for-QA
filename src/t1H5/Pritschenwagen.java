package t1H5;

public class Pritschenwagen extends LKW{
    private boolean kippbar;

    public Pritschenwagen(String modellname, int leistung, int baujahr, double nutzlast, boolean kippbar) {
        super(modellname, leistung, baujahr, nutzlast);
        this.kippbar = kippbar;
    }


    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Kippbar: " + kippbar);
    }
}
