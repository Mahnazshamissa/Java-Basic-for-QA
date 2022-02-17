package t2ST2;

public class T2ST2 {

    public static void main(String[] args) {
        System.out.println("Umfang: " + KreisfoermigeKoerper.berechneUmfangKreis(5));
        System.out.println("Fläche: " + KreisfoermigeKoerper.berechneFlaecheKreis(5));
        System.out.println("Volumen von Kugel: " + KreisfoermigeKoerper.berechneVolumenKugel(5));
        System.out.println("Volumen von Kegel: " + KreisfoermigeKoerper.berechneVolumenKegel(5, 3));
    }
}
