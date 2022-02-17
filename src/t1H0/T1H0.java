package t1H0;

public class T1H0 {
    public static void main(String[] args) {
        Sattelschlepper s = new Sattelschlepper(2020, "Renault Truck", 35);
        s.drucken();
        Muldenkipper m = new Muldenkipper(2015, "Volvo Truck", 17.5);
        m.drucken();
        LKW[] fuhrpark = {s,m};
        System.out.println("\nMein Fuhrpark");
        for (LKW einLkw : fuhrpark){
            einLkw.drucken();
        }
    }
}
