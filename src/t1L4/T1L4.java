package t1L4;

import java.util.Scanner;

public class T1L4 {
    public static void main(String[] args) {
        BankKonto bk = new BankKonto(800, 1000);
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Aktion auswählen: 1 einzahlen, 2 abheben, 3 beednen");
            int aktion = Integer.parseInt(in.nextLine());
            if (aktion == 2) {

                System.out.println("Bitte Betrag eingeben");
                int betrag = Integer.parseInt(in.nextLine());
                if(bk.abheben(betrag) == false) {
                    System.out.println("Betrag zu hoch");
                }
                else {
                    System.out.println("Aktueller Kontostand " + bk.getKontoStand());
                }

            }
            if(aktion == 1) {
                System.out.println("Bitte Betrag eingeben");
                int betrag = Integer.parseInt(in.nextLine());
                bk.einzahlen(betrag);
            }
            if(aktion == 3) {
                break;
            }

            //		System.out.println("Kontostand nach Einzahlen von 100. " + bk.getKontoStand() + " Betr�gt neuer Kontostand. ");
            //		bk.abheben(500);
            //		System.out.println("Kontostand nach Abheben von 500. " + bk.getKontoStand() + " Betr�gt neuer Kontostand. ");

        }

    }
}
