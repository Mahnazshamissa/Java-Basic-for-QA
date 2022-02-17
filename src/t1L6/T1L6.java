package t1L6;

import java.util.Scanner;

public class T1L6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean nullGefunden = false;

        while (true){
            System.out.println("Geben Sie eine ganze Zahl ein");
            int zahl = Integer.parseInt(in.nextLine());
            if (zahl == -111){
                break;
            }
            else if (zahl <0){
            }
            else if (zahl > 0){
                System.out.println("Die Zahl " + zahl);
            }
            else {
                if (nullGefunden == false){
                    System.out.println("Die Zahl " + zahl);
                    nullGefunden = true;

                }
            }
        }

    }
}
