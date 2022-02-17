package t1H5;

public class T1H5 {

    public static void main(String[] args) {
        Limousine l1 = new Limousine("Opel Insignia", 125, 2019, 5);
        Limousine l2 = new Limousine("Opel Astra", 105, 2012, 5);
        l1.drucken();
        l2.drucken();
        Van v1 = new Van("Opel Zafira", 130, 2018, 7);
        Van v2 = new Van("Renault Espace", 145, 2020, 7);
        v1.drucken();
        v2.drucken();
        Cabrio c1 = new Cabrio("Audi CC", 165, 2017, 2, 1);
        c1.drucken();
        Pritschenwagen p1 = new Pritschenwagen("Mercedes", 175, 2016, 200.20, true);
        p1.drucken();
        Kastenwagen k1 = new Kastenwagen( "Man", 155, 2020, 120.20);
        k1.drucken();

    }
}
