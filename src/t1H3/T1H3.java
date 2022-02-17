package t1H3;

public class T1H3 {
    public static void main(String[] args) {
        Katze k = new Katze(2, "Weis", "Angela", "kurz");
        Hund h = new Hund(3, "Spotty", "Tom", "weich");
        Pferd p = new Pferd(7, "Schwarz", "Scherman", 6);
        Kuh kuh = new Kuh(6, "Hellbraun", "Lili", 20.2);
        k.drucken();
        k.gibLaut();
        h.drucken();
        h.gibLaut();
        p.drucken();
        p.gibLaut();
        kuh.drucken();
        kuh.gibLaut();

    }

}
