package t1A2;

public class Ratespiel {
    public void spiele(){

        int zufallszahl = (int) (Math.random() * 10);

        //Arrry für die Spieler anlegen (erzeugen)
        Spieler[] spieler = new Spieler[3];

        //Spieler Objekte erzeugen und ins Array eintragen
        spieler[0] = new Spieler("Mah");
        spieler[1] = new Spieler("Shami");
        spieler[2] = new Spieler("Amin");
        while(true) {
            for(Spieler einSp : spieler) {

                // Spieler nennt seine vorgeschlagene Zahl
                int zz = einSp.getNumber();

                // ist die Zahl richtig?
                if(zz == zufallszahl) {
                    System.out.println("Sieger ist " + einSp.getName() + " mit der Zahl " + zufallszahl);
                    return;
                }
                else {
                    System.out.println("Falsch! " + einSp.getName() + " mit " + zz);
                }
            }
        }
    }


}

