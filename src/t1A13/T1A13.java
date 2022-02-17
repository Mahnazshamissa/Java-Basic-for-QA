package t1A13;

public class T1A13 {

    public static void main(String[] args) {
        Fahrrad f1 = new Fahrrad("001", "Cannondale F700", 1000, 1500);
        Fahrrad f2 = new Fahrrad("002", "Cannondale F800", 1200, 1750);
        Fahrrad f3 = new Fahrrad("003", "Cannondale F900", 1200, 2150);
        FahrradHaendler fh1 = new FahrradHaendler(20);
        FahrradHaendler fh2 = new FahrradHaendler(10);
        FahrradHaendler fh3 = new FahrradHaendler(30);
        f1.drucken();



    }
}
