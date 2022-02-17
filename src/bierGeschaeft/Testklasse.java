package bierGeschaeft;

public class Testklasse {

    public static void main(String[] args) {

        Biergeschäft bg = new Biergeschäft("MusterGeschäft", 50, 100, 10);

        Flaschenbier fb1 = new Flaschenbier("Ottakring", 6.5, 9.99, 10);
        Flaschenbier fb2 = new Flaschenbier("Sturm", 2.5, 5.99, 15);

        Dosenbier db1 = new Dosenbier("Radler", 2.2, 7.5, 20);
        Dosenbier db2 = new Dosenbier("Corona", 5.2, 10.5, 50);

        Fass f1 = new Fass("Heineken", 8, 30, 50);
        Fass f2 = new Fass("Tuborg", 14, 50, 100);

        bg.einkaufen(fb1);
        bg.einkaufen(fb2);
        bg.einkaufen(db1);
        bg.einkaufen(db2);
        bg.einkaufen(f1);
        bg.einkaufen(f2);

        bg.drucken();

        bg.verkaufen(fb1);
        bg.verkaufen(f2);

        bg.drucken();

    }
}
