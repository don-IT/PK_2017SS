import java.util.Arrays;

/**
 * Created by cehajicomar on 09.05.17.
 */
public class array9 {
    public static void main(String[] args) {
        int[] x={3,4,3,4,5};
        //int[] y=ar(x);
       // System.out.println(Arrays.toString(y));
        fillarray(x,3);
    }
    public  static int[] ar(int[] ar){
        int[] array2=new int[ar.length];
        int j=array2.length-1;
        for(int i =0;i<ar.length;i++,j--){
            array2[i]=ar[j];
        }
        return array2;
    }
    public static void fillarray(int[] array,int n){
        if(n>0){
            fillarray(array,n-1);
            array[n-1]=n;
            System.out.println((Arrays.toString(array)));
        }

    }
}
