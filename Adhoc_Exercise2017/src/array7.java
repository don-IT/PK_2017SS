/**
 * Created by cehajicomar on 09.05.17.
 */
public class array7 {
    public static void main(String[] args) {
        double[] x=createarry(5);
        for(double a:x){
            System.out.print(a+", ");
        }
        System.out.println();
        printarray(x,4);
       halvearray(x);
    }
    public static double [] createarry(int n){
        double [] array=new double[n];
        for(int i=0;i<array.length;i++){
            array[i]=Math.round(Math.random()*100);
        }
        return array;
    }
    public static void printarray(double[] array1,int y) {
        double d = 100 / y;
        for (int z = 0; z < y; z++) {
            int counter = 0;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] >= d * z && array1[i] < d * (z + 1)) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
    public static void halvearray(double[] arrayy){
        double[] arr=new double[arrayy.length+1];
        for(int i=0;i<arrayy.length;i++){
            arr[i]=(arrayy[i])/2;
        }
        for(double t:arr){
            System.out.print(t+" ");
        }
    }
}