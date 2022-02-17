package t1K7;

public class T1K7 {
    public static void main(String[] args) {
        Punkt anfang = new Punkt(0,0);
        Punkt ende = new Punkt(3,4);
        Strecke s= new Strecke(anfang,ende);
        System.out.println("Länge: "+ s.berechneLaenge());
    }
}
