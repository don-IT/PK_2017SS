/**
 * Created by cehajicomar on 28.04.17.
 */
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        int [] myList=new int[10];
        //myList[2]=myList[1]+myList[3];
       // System.out.println(myList[2]);
        //for (int i = 0; i < myList.length; i++) {
        //    myList[i] = i;
            //System.out.println(myList[1]);}

           Scanner arrayscanner=new Scanner(System.in);
            System.out.print("Enter " + myList.length + " values: ");
            for (int i = 0; i < myList.length; i++){
                myList[i]=arrayscanner.nextInt();
                System.out.println(myList[i]+"");
            }


        double max = myList[0];
        int indexOfMax = 0;
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) { max = myList[i]; indexOfMax = i;
            }

        }
        System.out.println(indexOfMax);}
    }

