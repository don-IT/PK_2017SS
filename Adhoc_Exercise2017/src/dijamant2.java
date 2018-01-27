/**
 * Created by cehajicomar on 23.03.17.
 */
public class dijamant2 {
    public static void main(String[] args) {
        int zeile=1;
        while(zeile<=20){
            if(zeile<=10) {
                int spalte = 1;
                while (spalte <= 20) {
                    if (spalte <= 10 - (zeile - 1) || spalte >= 11 + (zeile - 1)) {
                        System.out.print("H");
                        spalte++;
                    } else {
                        System.out.print(" ");
                        spalte++;
                    }
                }
            }
                else{
                    int spalte=1;
                    while(spalte<=20){
                        if(spalte<=zeile-10 || spalte>=20-(zeile-11)){
                            System.out.print("H");
                            spalte++;
                        }
                        else{
                            System.out.print(" ");
                            spalte++;
                        }
                    }
                }
            System.out.println();
            zeile++;
            }
        }
    }