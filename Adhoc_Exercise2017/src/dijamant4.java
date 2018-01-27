/**
 * Created by cehajicomar on 23.03.17.
 */
public class dijamant4 {
    public static void main(String[] args) {
        int zeilen=1;
        while(zeilen<=20){
            if (zeilen<=10){
                int spalten=1;
                while (spalten<=20){
                    if(spalten>=1+(zeilen-1) && spalten<=20-(zeilen-1)){
                        System.out.print("-");
                        spalten++;
                    }
                    else{
                        System.out.print("0");
                        spalten++;
                    }
                }
            }
                else {
                int spalte = 1;
                while (spalte <= 20) {
                    if (spalte>=21-zeilen && spalte<=zeilen){
                        System.out.print("-");
                        spalte++;
                }
                else{
                        System.out.print("0");
                        spalte++;
                    }
                }
            }
                zeilen++;
            System.out.println();
            }
        }
    }