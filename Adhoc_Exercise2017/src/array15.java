import java.util.Arrays;

/**
 * Created by cehajicomar on 14.05.17.
 */
public class array15 {
    public static void main(String[] args) {
        int[] array = new int[]{0,1,1,4,5};
        dopleftmutating(array,3);
        System.out.println(Arrays.toString(array));

    }
    public static int [] dopleftmutating(int[] array,int value){
        if(array!=null) {
            int index = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] >= value) {
                    index=i-1;
                    break;
                }
            }
            for(int j=0;j<array.length;j++){
                if(j<index){
                    array[j]=array[j+1];
                }else if(j==index){
                    array[j]=value;
                }
            }
        }
        return array;
    }
}
