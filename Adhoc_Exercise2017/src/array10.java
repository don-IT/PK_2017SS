import java.util.Arrays;

/**
 * Created by cehajicomar on 10.05.17.
 */
public class array10 {
    public static void main(String[] args) {
        int m=5;
        int[] x=new int[m];
        int[] y=createarray(m,x);
        System.out.println(Arrays.toString(y));
    }
    public static int[] createarray(int n,int[] array){
        if(n>0){
            createarray(n-1,array);
            array[n-1]=n;
        }
        return array;
    }
}