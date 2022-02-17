package t1L2;

public class T1L2 {
    public static void main(String[] args) {
        RechnenMit1Zahlen r1z = new RechnenMit1Zahlen(7);
        r1z.fakultaet();
        r1z.collatz();

        RechnenMit1Zahlen r1z2 = new RechnenMit1Zahlen(0);
        r1z2.fakultaet();

        RechnenMit1Zahlen r1z3 = new RechnenMit1Zahlen(10938);
        r1z3.quersumme();
    }
}
