package t1I2;

import java.util.Scanner;

public class T1I2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Verheiratet j/n");
        char verheiratet = in.nextLine().charAt(0);
        System.out.println("Student j/n");
        char student = in.nextLine().charAt(0);
        int beitrag = 500;
        if (verheiratet == 'j' || verheiratet == 'J') {
            beitrag -= 100;
        }

        if (student == 'j' || student == 'J') {
            beitrag -= 200;
        }

        System.out.println("Beitrag zu bezahlen: " + beitrag);
    }
}
