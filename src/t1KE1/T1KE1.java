package t1KE1;

import java.util.Scanner;

public class T1KE1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ganz Zahl eingeben");
        int ganzeZahl = Integer.parseInt(in.nextLine());
        System.out.println("Eingegeben wurde " + ganzeZahl);
        System.out.println("Gleitkommazahl eingeben");
        double glkZahl = Double.parseDouble(in.nextLine());
        System.out.println("Eingegeben wurde " + glkZahl);
        System.out.println("Einzelnes Zeichen eingeben");
        char einZeichen = in.nextLine().charAt(0);
        System.out.println("Eingegeben wurde " + einZeichen);
        System.out.println("Ganze Zeile");
        String zeile = in.nextLine();
        System.out.println("Eingegeben wurde " + zeile);
        int i = 5;
        //int i = i + 1;
        int j = 5 + i - 37;
        int k = 5 + i++ - 37;
        System.out.println("Eingegeben wurde " + j + "   und   " + k);

    }
}
