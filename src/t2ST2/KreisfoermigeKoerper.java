package t2ST2;

public class KreisfoermigeKoerper {

    public static double berechneFlaecheKreis(int radius){
        //return radius * radius * Math.PI;
        return Math.pow(radius, 2) * Math.PI;
    }

    public static double berechneUmfangKreis(int radius){
        return 2 * radius * Math.PI;
    }
    public static double berechneVolumenKugel(int radius){
        // return 4 * radius * radius * radius * Math.PI / 3 ;
        return 4 * Math.pow(radius, 3) * Math.PI / 3 ;
    }

    public static double berechneVolumenKegel(int radius , int hoehe){
        return Math.pow(radius, 2) * hoehe * Math.PI / 3;
    }


}
