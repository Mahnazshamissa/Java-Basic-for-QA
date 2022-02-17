package t1K5;

public class T1K5 {
    public static void main(String[] args) {
        Rechteck r = new Rechteck(5, 4);
        System.out.println("SeiteA: " + r.getSeiteA());
        System.out.println("SeiteB: " + r.getSeiteB());
        System.out.println("Umfang: " + r.umfang());
        System.out.println("Fläche: " + r.flaeche());
    }
}
