/**
 * Created by cehajicomar on 08.05.17.
 */
public class array5 {
    public static void main(String[] args) {
        int[] b=new int[5];
        int[] x=createArray(b,11);
        for(int i=0;i<x.length;i++) {
            System.out.print(x[i]);
            if(i==x.length-1){
                System.out.print("");
            }else{
                System.out.print(",");
            }
        }
        int[] c=zeroarrray(x,13);
        System.out.println();
        for(int i=0;i<c.length;i++) {
            System.out.print(x[i]);
            if(i==c.length-1){
                System.out.print("");
            }else{
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println();


        int [] array4={10,20,5,30};
        int[] d=slimArray(array4,10);
        for(int i=0;i<d.length;i++) {
            System.out.print(d[i]);
            if (i == d.length - 1) {
                System.out.print("");
            } else {
                System.out.print(",");
            }
        }
        int h=array4.length-d.length;
        System.out.println();
        System.out.println("geloscht ist "+h);
    }
    public static int [] createArray(int[] array, int wert){
        for(int i=0;i<array.length;i++){
            if(i%2==0){
                array[i]=wert;
            }else{
                array[i]=wert+wert;
            }
        }
        return array;
    }

    public static int[] zeroarrray(int[] ar,int find){
        for(int i=0;i<ar.length;i++){
            if(ar[i]>find){
                ar[i]=0;
            }
        }
        return ar;
    }
    public static int [] slimArray(int[] array2, int wert){
        int counter=0;
        for(int i=0;i<array2.length;i++){
            if(array2[i]<=wert){
                counter++;
            }
        }
        int[] newaray=new int[counter];
        for(int k=0;k<newaray.length;){
            for(int s=0;s<array2.length;s++){
                if(array2[s]<=wert){
                    newaray[k]=array2[s];
                    k++;
                }
            }
        }
        return newaray;
    }
}
