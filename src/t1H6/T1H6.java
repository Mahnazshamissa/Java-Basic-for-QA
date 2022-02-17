package t1H6;

public class T1H6 {

    public static void main(String[] args) {

        CityBike cb1 = new CityBike("KTM", 3);
        Rennrad rr1 = new Rennrad("Cobra", 5);
        MountainBike mb1 = new MountainBike("Cube", 4);
        Moped mp1 = new Moped("BMW",6,"2 Takt");
        Motorrad mr1 = new Motorrad("Benz", 8, "4 Takt");
        cb1.drucken();
        rr1.drucken();
        mb1.drucken();
        mp1.drucken();
        mr1.drucken();
    }
}
