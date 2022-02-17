package t1H1;

public class T1H1 {
    public static void main(String[] args) {
        Blindenhund bh1 = new Blindenhund("Rex", 6, 25);
        Schosshund sh1 = new Schosshund("Susi", 4, 16);
        Kampfhund kh1 = new Kampfhund("Rambo", 2, 32);
        Hundehuette hh = new Hundehuette(10);
        hh.aufnehmen(bh1);
        hh.aufnehmen(sh1);
        hh.aufnehmen(kh1);
        hh.aufnehmen(new Schosshund("Strolchi", 5, 23));
        hh.aufnehmen(new Kampfhund("John", 1, 25));
        hh.drucken();
    }

}
