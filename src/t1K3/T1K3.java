package t1K3;

public class T1K3 {
    public static void main(String[] args) {
        Kreis k = new Kreis(5);
        System.out.println("Radius: " + k.getRadius());
        System.out.println("Umfang: " + k.umfang());
        System.out.println("Fläche: " + k.flaeche());
        k.setRadius(3);
        System.out.println("Radius: " + k.getRadius());
        System.out.format("Umfang: % .2f \n ", k.umfang());
        System.out.format("Fläche: % .2f ", k.flaeche());
    }
}
