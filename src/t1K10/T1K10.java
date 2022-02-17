package t1K10;

public class T1K10 {

    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter("Mah","Bakhshi",1500);
        Mitarbeiter m2 = new Mitarbeiter("Shami","Shahim", 1700);
        m1.drucken();
        m2.drucken();

        System.out.println("Jahresgehalt von " + m1.getVorname() + " beträgt " + m1.getMonatgehalt()*14 );
        System.out.println("Jahresgehalt von " + m2.getVorname() + " beträgt " + m2.getMonatgehalt()*14 );

        m1.setMonatgehalt(m1.getMonatgehalt()*1.15);
        m2.setMonatgehalt(m2.getMonatgehalt()*1.3);

        //System.out.println("Erhöhte Jahresgehalt von " + m1.getVorname() + " beträgt " + m1.getMonatgehalt()*14 );
        //System.out.println("Erhöhte Jahresgehalt von " + m2.getVorname() + " beträgt " + m2.getMonatgehalt()*14 );

        System.out.format("Erhöhte Jahresgehalt von %s beträgt %.2f\n" , m1.getVorname()  , m1.getMonatgehalt()*14 );
        System.out.format("Erhöhte Jahresgehalt von  %s beträgt %.2f\n" , m2.getVorname()  , m2.getMonatgehalt()*14 );

    }
}
