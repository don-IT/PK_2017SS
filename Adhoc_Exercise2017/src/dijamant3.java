/**
 * Created by cehajicomar on 23.03.17.
 */
public class dijamant3 {
    public static void main(String[] args) {
        int zeilen=1;
        while(zeilen<=12){
            int spalten=1;
            while(spalten<=19){
                if(spalten<=10-(zeilen-1) || spalten>9+(zeilen-1) || zeilen==11 ){
                    System.out.print("+");
                    spalten++;
                }
                else{
                    System.out.print(" ");
                    spalten++;
                }
            }
           zeilen++;
            System.out.println();
        }
    }
}