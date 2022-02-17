package t1H4;

public class Song {
    private String titel;
    private int laufzeit;

    public Song(String titel, int laufzeit) {
        this.titel = titel;
        this.laufzeit = laufzeit;
    }
    public int getLaufzeit() {
        return laufzeit;
    }
    public void drucken() {
        System.out.println("Songtitel: " + titel);
        System.out.println("Songlaufzeit: " + laufzeit);
    }
}
