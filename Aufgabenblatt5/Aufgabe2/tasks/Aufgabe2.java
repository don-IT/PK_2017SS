/*
    Aufgabe 2) Deque - Klammerung

    Implementieren Sie in Aufgabe2 eine statische Methode check, die einen
    String als Parameter hat und genau dann true zurückgibt, wenn der String
    einen korrekt geklammerten Ausdruck enthält. Ein Ausdruck ist dann korrekt
    geklammert, wenn es zu jeder öffnenden Klammer '(', '[' oder '{' eine
    entsprechende schließende Klammer ')', ']' oder '}' gibt. Zwischen diesen
    Zeichen können beliebige andere Zeichen vorkommen.

    Beispiele für korrekt geklammerte Ausdrücke:
    "", "a*[a+12]", "a+(b)-c", "a+{b+8+(b+c)}/a"
    Beispiele für nicht korrekt geklammerte Ausdrücke:
    "[", "(}", "a)[]", "([)]", "]["

    Verwenden Sie einen Stack zur Überprüfung der Klammerung: Durchlaufen Sie
    die Zeichen im String von vorne nach hinten und legen Sie jede öffnende
    Klammer, die Sie dabei finden, auf den Stack. Wenn Sie auf eine schließende
    Klammer stoßen, nehmen Sie das oberste Element vom Stack; bei korrekter
    Klammerung muss die schließende Klammer mit der Klammer vom Stack
    zusammenpassen. Andere Zeichen werden einfach ignoriert. Bei korrekter
    Klammerung muss der Stack am Ende leer sein.

    Hinweis: Sie können als Stack z.B. ein Objekt des Typs Deque<String>
    verwenden.

    Zusatzfragen:
    1. Was unterscheidet Queue von Map?
    1. Was ist der Unteschied zwischen LIFO und FIFO Prinzip?
    2. Wie könnte man diese Aufgabe auch mit einem Array statt einem Stack
       lösen? Welche Nachteile würden sich daraus ergeben?
*/
import java.util.Deque;
import java.util.LinkedList;
public class Aufgabe2{


    public static boolean check(String zeichenkette) {
        Deque<Character> ausdruck = new LinkedList<Character>();

        for (int i = 0; i < zeichenkette.length(); i++) {
            if (zeichenkette.charAt(i) == '(' || zeichenkette.charAt(i) == '[' || zeichenkette.charAt(i) == '{') {
                ausdruck.push(zeichenkette.charAt(i));
            }
            if (zeichenkette.charAt(i) == ')' && ausdruck.peek() != null && ausdruck.peek() == '(') {
                ausdruck.pop();
            } else if (ausdruck.isEmpty() && zeichenkette.charAt(i) == ')') {
                ausdruck.push(zeichenkette.charAt(i));
            }

            if (zeichenkette.charAt(i) == ']' && ausdruck.peek() != null && ausdruck.peek() == '[') {
                ausdruck.pop();
            } else if (ausdruck.isEmpty() && zeichenkette.charAt(i) == ']') {
                ausdruck.push(zeichenkette.charAt(i));
            }

            if (zeichenkette.charAt(i) == '}' && ausdruck.peek() != null && ausdruck.peek() == '{') {
                ausdruck.pop();
            } else if (ausdruck.isEmpty() && zeichenkette.charAt(i) == '}') {
                ausdruck.push(zeichenkette.charAt(i));
            }
        }

        if (ausdruck.isEmpty()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(check(""));
        System.out.println(check("a*[a+12]"));
        System.out.println(check("a+(b)-c"));
        System.out.println(check("a+{b+8+(b+c)}/a"));

        System.out.println(check("["));
        System.out.println(check("(}"));
        System.out.println(check("a)[]"));
        System.out.println(check("([)]"));
        System.out.println(check("]["));
    }
}

