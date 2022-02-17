package t1A4;

public class T1A4 {

    public static void main(String[] args) {
        Kurs k = new Kurs("Programmieren Java", 1250);
        k.anmelden("Shami");
        k.anmelden("Theo");
        k.anmelden("Mia");
        k.anmelden("Mah");
        k.drucken();
        k.stornieren("Theo");
        k.anmelden("Dr. Bakhshi");
        k.anmelden("MsC. Amin");
        k.stornieren("Mia");
        k.anmelden("MA Mahnaz");
        k.drucken();

    }
}
