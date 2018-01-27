/*******************************************************************************

 AUFGABENBLATT 3 - Allgemeine Informationen

 Achten Sie bei der Implementierung auf folgende Punkte:

 - Ihr Programm sollte den dazugehörenden Test (z.B. enthält Aufgabe1Test den
 Test zu Aufgabe1) bestehen.

 - Bei jeder Aufgabe finden Sie Zusatzfragen. Diese Zusatzfragen beziehen sich
 thematisch auf das erstellte Programm. Sie müssen diese Zusatzfragen in der
 Übung beantworten können.

 - Verwenden Sie bei allen Ausgaben immer System.out.println().

 Abgabe: Die Abgabe erfolgt in TUWEL. Bitte laden Sie Ihr IntelliJ-Projekt
 bis spätestens Montag 24.04.2017 12:00 Uhr in TUWEL hoch. Zusätzlich
 müssen Sie in TUWEL ankreuzen welche Aufgaben Sie gelöst haben und während
 der Übung präsentieren können.

 ******************************************************************************/

/*
    Aufgabe 1) Schleifenanalyse

    Erweitern Sie die Klasse 'Aufgabe1' um eine statische Methode namens
    "drawNumDiamond(int h)", die einen Diamanten (Raute) mit Buchstaben ausgibt.
    Der übergebene Parameter "h" entspricht der Höhe des Diamanten (Raute).
    Ein h=9 führt zu folgender Ausgabe:

        A
       BBB
      CCCCC
     DDDDDDD
    EEEEEEEEE
     DDDDDDD
      CCCCC
       BBB
        A

    Wird eine gerade Zahl dem Parameter "h" übergeben so wird "NO VALID INPUT"
    ausgegeben. Bei h=0 wird nichts ausgegeben und die Methode sofort verlassen.
    Der Rückgabetyp der Methode ist "void".
    Es sollen für die Implmentierung der Methode nicht mehr als 3 for-Schleifen
    (keine while- oder do/while-Schleife) verwendet werden. Überlegen
    Sie wie man eventuell weitere for-Schleifen einsparen könnte.
    (Die Methode soll für h <= 51 funktionieren.)

    Zusatzfragen:
    1. Wie ist die Vorgangsweise abzuändern, wenn statt jedem Buchstaben A die
    Zahl 1, statt jedem Buchstaben B die Zahl 2, usw. ausgegeben werden soll?
    (Die abgeänderte Methode soll für h <= 17 funktionieren.)
*/
public class Aufgabe1 {
    
    public static void drawNumDiamond(int h){
        if(h==0){
            System.exit(0);
        }
        else if(h%2==0) {
            System.out.println("NO VALID INPUT");
        }else {
            char a='A';
            for(int j=0;j<h;j++){
                if (j<=h/2) {
                    for (int i = 0; i <= h; i++) {
                        if (i >= (h / 2) - j && i <= (h / 2) + j) {
                            System.out.print(a);
                        } else if (i==h){
                            System.out.println();
                        }
                        else{
                            System.out.print(" ");
                        }
                    }a++;
                    if(j==h/2) {
                        a--;
                    }
                }else if(j>h/2&&j<=h){
                    a--;
                    for(int k=0;k<=h;k++){
                        if(k>=j-(h/2)&&k<h-(j-(h/2))){
                            System.out.print(a);
                        }else if (k==h){
                            System.out.println();
                        }else{
                            System.out.print(" ");
                        }
                    }
                }

            }
        }
    }
    public static void main(String[] args) {
        drawNumDiamond(0);
    }
}


