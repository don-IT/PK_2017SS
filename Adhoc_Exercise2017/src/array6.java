/**
 * Created by cehajicomar on 08.05.17.
 */
public class array6 {
    public static void main(String[] args) {
        int[] aray= {1,2,4,3};
      int[]  d=mutatearray(aray);
        for(int k=0;k<d.length;k++){
            System.out.print(d[k]+", ");
        }
    }
    public static int[] mutatearray (int[] array){
        if(array.length==0){
            return array;
        }
        int[] newarray=new int[array.length];
        int j=newarray.length-1;
        for(int i=0;i<array.length;i++){
            newarray[j]=array[i];
            j--;
        }
        return newarray;
    }
}
