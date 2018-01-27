/**
 * Created by cehajicomar on 14.05.17.
 */
import java.util.Arrays;
public class array14 {
    public static void dropLeftMutating(int[] array, int value) {
    // TODO: implementieren Sie die Methode.
    int[] help = new int[array.length];
    int count = 1;
    boolean check = false;

    if (array != null) {


        for (int i = 0; i < array.length - 1; i++) {
            if (value <= array[i]) {
                help[i] = value;
                check = true;
            }
            if (check == true) {
                help[i] = array[i + 1];
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = help[i];

        }
    }
}
    public static int[] dropLeft(int[] array, int i) {
        // TODO: implementieren Sie die Methode.
        int[] help = new int[array.length];
        int count = 1;
        boolean check = false;

        if (array == null|| help== null) {
            return null;
        }


        for (int j = 0; j < array.length - 1; j++) {
            if (i <= array[j]) {
                help[j] = i;
                check = true;
            }
            if (check == true) {
                help[j] = array[j + 1];
            }
        }
        return array;

    }
    public static void main(String[] args) {

        //Testen von dropLeftMutating:
        int[] array = new int[]{0, 1, 1, 4, 5};
        dropLeftMutating(array, 3);
        System.out.println(Arrays.toString(array)); //[1, 1, 3, 4, 5]

        array = new int[]{5};
        dropLeftMutating(array, 0);
        System.out.println(Arrays.toString(array)); //[5]

        array = new int[]{2};
        dropLeftMutating(array, 3);
        System.out.println(Arrays.toString(array)); //[3]

        array = new int[]{};
        dropLeftMutating(array, 3);
        System.out.println(Arrays.toString(array)); //[]

    }
}
