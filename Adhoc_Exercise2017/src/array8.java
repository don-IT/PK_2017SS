import java.util.Arrays;

/**
 * Created by cehajicomar on 09.05.17.
 */
public class array8 {
    public static void main(String[] args) {
        int[] x=createarray(9);
        //shiftright2(x);
        int[][] a={{1,2,3},{4,5},{6,7,8,9},{10,11}};
        pokusajDva(a,3);
    }
    public static int[] createarray(int n){
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=i+1;
        }
        return array;
    }
    public static void shiftright(int[] array1){
        int[] array2=new int[array1.length];
        for(int j=0;j<array1.length;j++){
            array2[j]=array1[j];
        }
        for(int j=0;j<array1.length-1;j++) {
            array1[0] = array1[array1.length - 1];
            array1[j + 1] = array2[j];
        }
        for(int s:array1){
            System.out.print(s);
        }
    }
    public static void shiftright2(int[] array){
        int[] array2=new int[array.length];
        for(int j=0;j<array.length;j++){
            array2[j]=array[j];
        }
        for(int j=0;j<array.length-1;j++) {
            array2[0] = array[array.length - 1];
            array2[j + 1] = array[j];
        }
        for(int s:array2){
            System.out.print(s);
        }
        System.out.println();
        for(int s:array){
            System.out.print(s);
        }
    }
    public static void pokusajDva(int a[][], int n){
        if (n > 0){
            pokusajDva(a,n-1);
            System.out.println(Arrays.toString(a[n-1]));
        }
    }
}