/*
    Aufgabe 2) Verzweigungen und while-Schleife

    Erweitern Sie die main-Methode um folgende Funktionalität:
    - Schreiben Sie eine while-Schleife, die alle geraden, durch 9 teilbaren
      Zahlen von 0-1000 (inklusive) aufsummiert.
    - Geben Sie das Ergebnis mit "System.out.println()" aus.

    Zusatzfragen:
    1) Die Schleife summiert Werte zwischen 0 und 1000 (inklusive). Wie könnten
       Sie das Programm umbauen damit die Schleife beliebige Intervalle
       aufsummiert?
*/
public class Aufgabe2{

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 1000) {
            ++i;
            if (i % 9 == 0 && i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}

