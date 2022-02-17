package t1K1;

public class T1K1 {
    public static void main(String[] args) {
        MeinPC pc = new MeinPC();
        System.out.println("Status: " + pc.isStatus());
        pc.einschalten();
        System.out.println("Status: " + pc.isStatus());
        boolean r = pc.einschalten();
        if (!r) {
            System.out.println("Einschalten wurde nicht mehr ausgeführt");
        }

        pc.ausschalten();
        System.out.println("Status: " + pc.isStatus());
        if (!pc.ausschalten()) {
            System.out.println("Ausschalten wurde nicht mehr ausgeführt");
        }

    }
}
