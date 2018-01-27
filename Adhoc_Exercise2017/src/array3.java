/**
 * Created by cehajicomar on 07.05.17.
 */
public class array3 {
    public static void main(String[] args) {
        int[] n=new int[6];
        duplibrojevi(n);
    }
    public static void duplibrojevi(int[] a){
        for (int i=0; i<a.length; i++) {
            if (i == 0) {
                a[i] = 0;
                System.out.print(a[i]+" ");
            } else {
                a[i] = a[i - 1] * 2 + 2;
                System.out.print(a[i] + " ");
            }
        }
        }


    }

