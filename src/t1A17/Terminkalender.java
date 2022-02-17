package t1A17;

public class Terminkalender {
    private String [][][] termine = new String[12][31][24];

    //Methoden

    // monat: 1 - 12
    // tag: 1 - 31
    // stunde: 0 - 23
    public void eintragen(int monat, int tag, int stunde, String text) {
        termine[monat - 1][tag - 1][stunde] = text;
    }

    public void drucken(int monat, int tag) {
        for(int stunde = 0; stunde < termine[monat - 1][tag - 1].length; stunde++) {
            if(termine[monat - 1][tag - 1][stunde] != null) {
                System.out.println(stunde + ":00 " + termine[monat - 1][tag - 1][stunde]);
            }
        }
    }

}
