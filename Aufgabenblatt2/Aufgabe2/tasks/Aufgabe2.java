/*
    Aufgabe2) Eingabe (Scanner)

    Erweitern Sie die main-Methode so, dass wiederholt Werte eingelesen werden,
    bis die Zahl 0 eingegeben wird. Dann wird das Programm beendet. Zuvor wird
    noch der Durchschnittswert aller eingelesenen Zahlen als ganzzahliger Wert
    ausgegeben (Nachkommastellen gehen verloren),  falls alle eingelesenen Werte
    ganze Zahlen waren. In allen anderen Fällen wird nichts ausgegeben.

    Zusatzfragen:
    1. Warum muss eine ungültige Eingabe (keine ganze Zahl) aus dem
    Input-Stream entfernt werden?
    2. Woran kann man erkennen, dass ein eingelesener Wert eine ganze Zahl ist?
    3. Woran kann man feststellen, ob eine frühere Eingabe ungültig war?
*/
import java.util.Scanner;
public class Aufgabe2{

    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        boolean numbers = true;
        int value = 1;

        Scanner scanner = new Scanner(System.in);

        while (value != 0 && scanner.hasNext()) {

            if (scanner.hasNextInt()) {
                value = scanner.nextInt();


                if (value != 0) {

                    sum += value;
                    counter++;

                }
            } else {
                numbers = false;

                String x;
                x = scanner.next();
            }

        }
        if (numbers == true && counter != 0) {
            System.out.println(sum / counter);
        }    }
}

