/**
 * Created by cehajicomar on 07.05.17.
 */
public class array2 {
    public static void main(String[] args) {

        createarray(4);
    }
    public static void createarray(int a){
        double[] array=new double[a];

        for(int i=0;i<array.length;i++){
            double k=Math.random()*100;
            array[i]=k;
            System.out.println(array[i]);
        }

    }
    public static void printArray(int b,int n){
        double[] array=new double[b];

        for(int i=0;i<array.length;i++){
            double k=Math.random()*100;
            array[i]=k;
        }

        double[] array2=new double[n];





    }
}
