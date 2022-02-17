package t2ST5;

import java.util.Random;

public class FunnyFunction {

    public static String dreiFuenf(int zahl) {

        if(zahl % 3 == 0 && zahl % 5 == 0) {
            return "DreiFünf";
        }
        if(zahl % 3 == 0) {
            return "Drei";
        }
        if(zahl % 5 == 0) {
            return "Fünf";
        }
        else {
            return String.valueOf(zahl);
        }
    }


    public static String randomString(int n){
        Random random = new Random();
        String mah = "";
        for(int i = 1; i <= n; i++) {

            // nextInt(26) : 0 bis 25 inklusive
            //'A' : 65
            // (0 bis 25) + 65 --> 65 bis 90

            char kleinB = (char) (random.nextInt(26) + 'a');
            mah += kleinB;
        }
        return mah;
    }
}
