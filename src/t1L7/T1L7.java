package t1L7;

import java.util.Scanner;

public class T1L7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("eine Zahl eingeben");
        int zahl = Integer.parseInt(in.nextLine());
        while (zahl != 0) {
            int letzteZiffer = zahl % 10;
            zahl = zahl / 10;
            if (letzteZiffer == 0) {
                System.out.println("null ");
            } else if (letzteZiffer == 1) {
                System.out.println("eins ");
            } else if (letzteZiffer == 2) {
                System.out.println("zwei ");
            } else if (letzteZiffer == 3) {
                System.out.println("drei ");
            } else if (letzteZiffer == 4) {
                System.out.println("vier ");
            } else if (letzteZiffer == 5) {
                System.out.println("f�nf ");
            } else if (letzteZiffer == 6) {
                System.out.println("sechs ");
            } else if (letzteZiffer == 7) {
                System.out.println("sieben ");
            } else if (letzteZiffer == 8) {
                System.out.println("acht ");
            } else {
                System.out.println("neun ");
            }
        }
        System.out.println();
    }
}
