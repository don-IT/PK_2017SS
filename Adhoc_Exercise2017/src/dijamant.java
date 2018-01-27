/**
 * Created by cehajicomar on 20.03.17.
 */
public class dijamant {
    public static void main(String[] args) {

        String h = "H";
        String r = " ";
        int zeile = 1;
        while (zeile <= 13) {
            if (zeile <= 7) {
                int spalte = 1;
                while (spalte <= 20) {
                    if((spalte<=3+zeile)|| spalte>=18-zeile || zeile<=1) {
                        System.out.print(h);
                        spalte++;
                    }
                    else {
                        System.out.print(r);
                             spalte++;
                        }
                    }
                }
                else {
                int spalte = 1;
                while (spalte <= 20) {
                    if ((spalte <= 17 - zeile) || (spalte >= 4 + zeile)|| zeile>=13) {
                        System.out.print(h);
                        spalte++;
                    } else {
                        System.out.print(r);
                        spalte++;
                    }
                }
            }
            System.out.println();
            zeile++;
            }
        }
    }