package t1aKH19;

public class T1aKH19 {
    public static void main(String[] args) {
        Marina marina = new Marina("Zadar",5,3,2);
        Runderboot rb1 = new Runderboot("RB 2020", "Mah" , 1500.50, 50);
        Runderboot rb2 = new Runderboot("RB 2021", "Mehri" , 1700.70, 70);
        Segelboot sb1 = new Segelboot("SB 2018", "Amin", 1200.20, 20);
        Segelboot sb2 = new Segelboot("SB 2019", "Amene", 1400.40, 40);
        Motorboot mb1= new Motorboot("MB 2016", "Shami", 20000, 6);
        Motorboot mb2= new Motorboot("MB 2017", "Shahin", 30000, 9);
        marina.anlegen(rb1);
        marina.anlegen(rb2);
        marina.anlegen(sb1);
        marina.anlegen(sb2);
        marina.anlegen(mb1);
        marina.anlegen(mb2);
        marina.drucken();

        marina.entfernen(sb2);
        marina.entfernen(mb2);
        marina.wertsteigerung(20,10,15);
        marina.drucken();



    }
}
