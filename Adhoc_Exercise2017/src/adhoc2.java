/**
 * Created by cehajicomar on 31.03.17.
 */
import java.util.Scanner;
public class adhoc2 {
    public static void main(String[] args) {
      int a=(int)(Math.random()*100);
        int pogadjanje=8;
        Scanner scanner=new Scanner(System.in);
        while(pogadjanje>0 && scanner.hasNext() ){
            if(scanner.hasNextInt()){
                pogadjanje--;
                int value=scanner.nextInt();
                if(value==-1){
                    pogadjanje=0;
                }else if(value<-1 || value>99){
                        System.out.println("not in option");
                    } else if(value==a){
                            System.out.println("Gewinner");
                            pogadjanje=0;
                        } else if(value<a){
                                System.out.println("Probaj veci broj");
                            } else{
                                System.out.println("Probaj manji broj");
                            }
            } else{
                String s=scanner.next();
                System.out.println("Ungultiger Eingabee!");
                pogadjanje--;
            }
        }
    }
}