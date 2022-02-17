package t1L1;

public class RechnenMit2Zahlen {
    private int zahl1;
    private int zahl2;

    public RechnenMit2Zahlen(int z1, int z2) {
        this.zahl1 = z1;
        this.zahl2 = z2;
    }

    public void multiplizieren(){
        int ergebnis = 0;
        for (int i=1; i <= zahl2 ; i++){
            ergebnis += zahl1;
        }
        System.out.println("Multiplikation: " + ergebnis);
    }


    public void dividieren(){
        int z1= zahl1;
        int ergebnis = 0;
        while (z1 >= zahl2){
            z1 -= zahl2;
            ergebnis++;
        }

        System.out.println("Division: "+ ergebnis + " mit Rest " + z1);
    }


    public void ggt(){
        int z1= zahl1;
        int z2= zahl2;
        int ergebnis = 0;
        while (z1 != z2){  // while(!(z1==z2))
            if (z1>z2){
                z1-= z2;
            }
            else {
                z2 -= z1;
            }
        }

        System.out.println("GGT: "+ z1 );
    }

}
