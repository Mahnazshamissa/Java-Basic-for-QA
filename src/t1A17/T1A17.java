package t1A17;

import java.util.Scanner;

public class T1A17 {
    public static void main(String[] args) {
        Terminkalender tk = new Terminkalender();
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Monat oder x");
            String monat = in.nextLine();
            if(monat.equals("x"))
                break;
            System.out.println("Tag");
            int tag = Integer.parseInt(in.nextLine());
            System.out.println("Stunde");
            int stunde = Integer.parseInt(in.nextLine());
            System.out.println("Tätigkeit");
            String todo = in.nextLine();
            tk.eintragen(Integer.parseInt(monat), tag, stunde, todo);

        }
        tk.drucken(11, 8);
    }
}
