package t1A11;

public class T1A11 {
    public static void main(String[] args) {
        Ware brot = new Ware("A1","Brot", 4.53);
        Ware butter = new Ware("A2", "Butter", 2.25);
        Ware milch = new Ware("A3","Milch", 1.15);
        Ware eier = new Ware("A4","Eier", 3.65);
        Rechnung r = new Rechnung(10);
        r.neueWare(brot, 2);
        r.neueWare(butter, 3);
        r.neueWare(milch, 1);
        r.neueWare(eier, 1);
        r.drucken();

    }
}
