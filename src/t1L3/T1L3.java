package t1L3;

import java.util.Scanner;

public class T1L3 {
    public static void main(String[] args) {
        BierLager bl = new BierLager(99);
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Geben Sie die Anzahl von Bierflaschen kaufen will:");
            int anzahl = Integer.parseInt(s.nextLine());
            if (bl.kaufen(anzahl)== true){
                System.out.println("Neuer Lagerstand: " + bl.getLagerstand());
                if(bl.isEmpty()==true){
                    break;
                }
            }
            else {
                System.out.println("Leider gibt es nicht genug Menge auf Lager.");
        }

        }
    }
}
