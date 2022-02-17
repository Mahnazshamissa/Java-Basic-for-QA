package t2ST4;

import java.time.Year;

public class Datum {
    private int tag;
    private int monat;
    private int jahr;

    public Datum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "tag=" + tag +
                ", monat=" + monat +
                ", jahr=" + jahr +
                '}';
    }

    public void addiereTage(int anzahl){
        if ( anzahl > 0 ){
            while (anzahl > 0){
                tag++;
                if (tag > getMonatstage(monat, jahr)){
                    tag = 1;
                    monat++;
                    if (monat > 12){
                        jahr++;
                        monat = 1;
                    }
                }
                anzahl--;
            }
        }
        else {
            while (anzahl < 0){
                tag--;
                if (tag == 0 ){
                    monat--;
                    if (monat == 0){
                        jahr--;
                        monat = 12;
                    }
                    tag = getMonatstage(monat, jahr);
                }
                anzahl++;
            }
        }
    }

    public static boolean isSchaltjahr(int jahr){

        return Year.isLeap(jahr);

/*
        if (jahr % 4 != 0) {
            return false;
        } else if (jahr % 400 == 0) {
            return true;
        } else if (jahr % 100 == 0) {
            return false;
        } else {
            return true;
        }

 */


        /*
        boolean isSchaltjahr = ((jahr % 4 == 0) && (jahr % 100 != 0) || (jahr % 400 == 0));

        if (isSchaltjahr)
        {
            println(jahr + " ist Schaltjahr.");
        } else
            println(jahr + " ist kein Schaltjahr.");

         */
    }

    public static int getMonatstage(int monat, int jahr) {

        if (monat == 1 || monat == 3 || monat == 5 || monat == 7 || monat == 8 || monat == 10 || monat == 12 ) {
            return 31;
        }
        if (monat == 4 || monat == 6 || monat == 9 || monat == 11) {
            return 30;
        }
        if ( isSchaltjahr(jahr)){
            return 29;
        }
        else {
            return 28;
        }

        /*

        String monatName = "";
        int monatsTage = 0;

        switch (monat) {
            case 1:
                monatName = "January";
                monatsTage = 31;
                break;
            case 2:
                monatName = "February";
                //if ((jahr % 400 == 0) || ((jahr % 4 == 0) && (jahr % 100 != 0))) {
                if (isSchaltjahr(jahr)) {
                    monatsTage = 29;
                } else {
                    monatsTage = 28;
                }
                break;
            case 3:
                monatName = "March";
                monatsTage = 31;
                break;
            case 4:
                monatName = "April";
                monatsTage = 30;
                break;
            case 5:
                monatName = "May";
                monatsTage = 31;
                break;
            case 6:
                monatName = "June";
                monatsTage = 30;
                break;
            case 7:
                monatName = "July";
                monatsTage = 31;
                break;
            case 8:
                monatName = "August";
                monatsTage = 31;
                break;
            case 9:
                monatName = "September";
                monatsTage = 30;
                break;
            case 10:
                monatName = "October";
                monatsTage = 31;
                break;
            case 11:
                monatName = "November";
                monatsTage = 30;
                break;
            case 12:
                monatName = "December";
                monatsTage = 31;
        }

        // System.out.print(monatName + " " + jahr + " hat " + monatsTage + " Tage\n");

        return monatsTage;

         */

    }

}
