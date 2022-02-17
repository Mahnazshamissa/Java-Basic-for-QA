package t1L2;

public class RechnenMit1Zahlen {
    private int zahl;

    public RechnenMit1Zahlen(int z) {
        this.zahl = z;
    }
     // 5!=5*4*3*2*1
    // 0!= 1

    public void fakultaet(){

        int ergebnis = 1;
        for (int i = zahl;  i>0; i--){
            ergebnis *= i;
        }

        System.out.println("Falkultät: " + ergebnis);
    }


    public void collatz(){
        int z = zahl;
        while (z!=1){
            if ( z % 2 == 0){
                // gerade
                z= z / 2;

            }
            else {
                // ungerade
                z= 3 * z +1;
            }

            System.out.println(z);
        }
    }
    /*
    10938

    1+0+9+3+8=21

    10938 % 10 --> 8
    10938 / 10 --> 1093
    1093 % 10 --> 3
    1093 / 10 --> 109

     */

    public void quersumme(){
        int ergebnis = 0;
        int z = zahl;
        while (z>0){
            ergebnis += z% 10; // rechte Ziffer ermitteln
            z = z/10;  // Zahl um eine Stelle nach rechts schieben
        }

        System.out.println("Quersumme: " + ergebnis);
    }

}
