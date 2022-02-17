package t1A3;

public class T1A3 {
    public static void main(String[] args) {
        Hund[] h = new Hund [3];

        h[0] = new Hund("Fifi", 7);
        h[1] = new Hund("Papet", 5);
        h[2] = new Hund("Rio", 2);

        // h[0].bellen();
        // h[1].bellen();
        // h[2].bellen();

        for (Hund hund : h ){
            hund.bellen();
        }




    }
}
