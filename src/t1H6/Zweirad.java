package t1H6;

public abstract class Zweirad {

    private String modellname;

    public Zweirad(String modellname) {
        this.modellname = modellname;
    }

    public void drucken() {
        System.out.println("\n" + this.getClass().getSimpleName());
        System.out.println("Modellname: " + modellname);

    }
}
