/**
 * Created by cehajicomar on 23.03.17.
 */
public class dijamant1 {
    public static void main(String[] args) {
        int zeile=1;
        while (zeile<=10){
            if(zeile<=6){
                int spalte=1;
                while(spalte<=10){
                    if(spalte<=10/2 -(zeile-1)){
                        System.out.print("HH");
                        spalte++;
                    }
                    else{
                        if(spalte>10/2+(zeile-1)) {


                            System.out.print("XX");
                            spalte++;
                        }
                        else{
                            System.out.print("--");
                            spalte++;
                        }
                    }
                }
            }
            else{
                int spalte=1;
                while(spalte<=10){
                    if(spalte>10-(zeile-1) && spalte<=5){
                        System.out.print("HH");
                        spalte++;
                    }
                    else{
                        if(spalte<zeile && spalte>5){
                            System.out.print("XX");
                            spalte++;
                        }
                        else{
                            System.out.print("--");
                            spalte++;
                        }
                    }
                }
            }
            System.out.println();
            zeile++;
        }
    }
}