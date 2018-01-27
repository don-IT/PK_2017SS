import java.util.Arrays;

/**
 * Created by cehajicomar on 13.05.17.
 */
public class array11 {
    public static void main(String[] args) {
        int[][] array={{1,2,3,4},{5,6,7},{8,9},{0,1,2,3}};
        columnlenght(array,0);
        createcolumn(array,3);
        int[][] c=createtransposed(array);
        for (int i=0;i<c.length;i++){
            System.out.println(Arrays.toString(c[i]));
        }
    }
    public static int [][] createtransposed(int [][] array){
        int counter=0;
        for(int z=0;z<array.length;z++) {
            if (counter < array[z].length - 1) {
                counter = array.length;
            }
        }
        int [][] b=new int[counter][];
        for(int i=0;i<b.length;i++){
            b[i]=createcolumn(array,i);
        }
        return b;
    }
    public static void columnlenght(int arr[][],int j){
        for(int z=0;z<arr.length;){
            if(arr[z].length>j && z==arr.length-1){
               System.out.println("fehler an:"+arr.length);
               break;
            }else if(arr[z].length==j){
                System.out.println("fehler an:"+z);
                break;
            }else if(arr[z].length>j ){
                z++;
            }else {
                System.out.println("Ungultig");
                break;
            }
        }
    }
    public static int [] createcolumn(int array[][],int j){
        int counter=0;
        for(int z=0;z<array.length;z++) {
                if (array[z].length>j){
                    counter++;
            }
            if(array[z].length<=j ){
                z=array.length;
            }
        }
        int[] narr=new int[counter];
        int a=0;
            for (int i = 0; i < array.length; i++) {
                if(array[i].length>j) {
                    narr[a] = array[i][j];
                    a++;
            }
            if(array[i].length<=j ){
                    i=array.length;
            }
        }
            return narr;
    }
}