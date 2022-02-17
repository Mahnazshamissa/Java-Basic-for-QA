package t1K9;


import java.util.Random;

public class WuerfelMax {

    private String name;
    private int count;
    private Random random;

    public WuerfelMax(String n,Random r){
        name = n;
        random = r;
    }

    public void wuerfeln(){

        // zufällige Augenzahl für die beiden Würfel ermitteln
        // nextInt(6) : Zufallszahl liegt zwischen 0 und 5 inklusive

        int wuerfel1 = random.nextInt(6)+1;
        int wuerfel2 = random.nextInt(6)+1;

        if (wuerfel1+wuerfel2==3){
            count+= 1000;

        }
        else if (wuerfel1==wuerfel2){
            count+= wuerfel1*100;
        }
        else {
            count+= Math.max(wuerfel1,wuerfel2)*10+Math.min(wuerfel1,wuerfel2);
        }

        System.out.println("Würfel1: " + wuerfel1 + " , Würfel2: " + wuerfel2);
        System.out.println("Neuer count: " + count);
    }
}
