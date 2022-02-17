package t1K9;

import java.util.Random;

public class T1K9 {
    public static void main(String[] args) {
        WuerfelMax wm = new WuerfelMax("Siegfried" , new Random());
        for (int i=1; i<= 20; i++){
            wm.wuerfeln();
        }

    }
}
