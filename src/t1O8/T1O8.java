package t1O8;

import java.util.Scanner;

public class T1O8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Gewicht eingeben");
        double gewicht = Double.parseDouble(in.nextLine());
        System.out.println("Körpergröße in Meter eingeben");
        double körpergröße = Double.parseDouble(in.nextLine());
        double quadratKörpergröße = körpergröße * körpergröße;
        double bmi = gewicht / quadratKörpergröße;
        System.out.format("Body Mass Index: %.2f\n  ", bmi);
    }
}
