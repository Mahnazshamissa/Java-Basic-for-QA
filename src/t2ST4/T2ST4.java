package t2ST4;

public class T2ST4 {
    public static void main(String[] args) {

        Datum datum = new Datum(9, 2,2022);
        datum.addiereTage(365);
        System.out.println("Datum:" + datum.toString());
        datum.addiereTage(- 365);
        System.out.println("Datum:" + datum.toString());
        datum.addiereTage(- 711);
        System.out.println("Datum:" + datum.toString());


    }
}
