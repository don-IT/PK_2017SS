/**
 * Created by cehajicomar on 08.05.17.
 */
import java.util.Arrays;
import java.util.Scanner;
public class array4 {
    public static void main(String[] args) {
        char [] aray=cardslot();
        char[] arr=cheat(aray,4);
        System.out.println(Arrays.toString(arr)+" Insert char");
        Scanner scanner =new Scanner((System.in));
        char g= scanner.next().charAt(0);
        boolean recht=false;
        boolean links=false;
        for(int j=0;j<aray.length;j++){
            if(aray[j]==g){
                recht=true;
            }
        }
        if(recht==false){
            System.out.println("ungultige eingabe");
        }else {
            for (int b = 0; b < arr.length; b++) {
                if (arr[b] == g) {
                    links = true;
                }
            }
            if (links == true && recht == true) {
                System.out.println("ok");
            } else {
                System.out.println("Falsch");
            }
        }
    }
    public static char[]cardslot(){
        char [] array=new char[]{'2','3','4','5','6','7','8','9','B','Q','K','T','A'};
            System.out.println(Arrays.toString(array));
        return array;
    }
    public static char [] cheat(char [] array1,int n){
            if(n<array1.length && n>=0){
                char[] arraynew=new char[array1.length-1];
                for(int i =0;i<arraynew.length;i++){
                    if (i<n){
                        arraynew[i]=array1[i];
                    }else{
                        arraynew[i]=array1[i+1];
                    }
                }
                if(n<array1.length && n>=0){
                    return arraynew;
                }
            }
        return array1;
    }
}