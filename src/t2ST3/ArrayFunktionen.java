package t2ST3;

public class ArrayFunktionen {

    public static void printArray(int[] iArray) {

        for (int einZ : iArray){
            //System.out.println(einZ + " ");   // println --> Spalte
            System.out.print(einZ + " ");  // print --> Zeile
        }
        System.out.println();

    }

    /*
    1 2 3 4 5
    5 4 3 2 1
     */

    public static int[] swap(int[] iArray) {
        int[] nArray = new int[iArray.length];
        for (int i=0; i< iArray.length; i++){
            nArray[iArray.length - 1 - i] = iArray[i];
        }
        return nArray;
    }

    /*
    1 2 3 4 5
    tmp 1
    5 2 3 4 5
    5 2 3 4 1
    tmp 2
    5 4 3 4 1
    5 4 3 2 1
     */

    public static void swapInPlace(int[] iArray){
        for (int i = 0; i< iArray.length / 2; i++){
            int tmp = iArray[i];
            iArray[i] = iArray[iArray.length - 1 - i];
            iArray [ iArray.length -1 -i ] = tmp ;
        }
    }
}
