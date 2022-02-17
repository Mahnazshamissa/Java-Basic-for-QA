package t1K6;

public class T1K6 {
    public static void main(String[] args) {
        Konto k = new Konto("Mah", 500,-60);
        k.einzahlen(150);
        System.out.println("Kontostand: " + k.kontostand());

        k.auszahlen(400);
        System.out.println("Kontostand: " + k.kontostand());

        k.auszahlen(600);
        System.out.println("Kontostand: " + k.kontostand());


    }
}
