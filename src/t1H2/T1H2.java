package t1H2;

public class T1H2 {
    public static void main(String[] args) {
        Fernseher f = new Fernseher(false, "ORF III", 50, 55);
        f.ein();
        Radio r = new Radio(true, "FM4", 60, false);
        Waschmaschine wm = new Waschmaschine(true, 1400);
        PC pc = new PC(true);
        Feuermelder fm = new Feuermelder();
        Haus haus = new Haus();
        haus.aufnehmen(f);
        haus.aufnehmen(r);
        haus.aufnehmen(wm);
        haus.aufnehmen(pc);
        haus.aufnehmen(fm);
        haus.drucken();
        haus.urlaub();
        System.out.println("\nStatus im Urlaub");
        haus.drucken();

    }
}
