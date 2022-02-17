package t1H2;

public abstract class Geraet {
    private boolean status;

    public Geraet (boolean st) {
        status = st;
    }
    public void ein() {
        status = true;
    }
    public void aus() {
        status = false;
    }
    public void drucken() {
        System.out.println("\n" + this.getClass().getSimpleName());
        System.out.println("Status: " + (status ? "eingeschaltet" : "ausgeschaltet"));
    }
}
