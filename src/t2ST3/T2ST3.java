package t2ST3;

public class T2ST3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("Array a");
        ArrayFunktionen.printArray(a);

        int[] b = ArrayFunktionen.swap(a);
        System.out.println("\nArray b");
        ArrayFunktionen.printArray(b);

        ArrayFunktionen.swapInPlace(b);
        System.out.println("\nUmgederehtes b Array");
        ArrayFunktionen.printArray(b);
    }
}
