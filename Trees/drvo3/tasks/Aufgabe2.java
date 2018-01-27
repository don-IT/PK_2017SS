/*
Schreiben bzw. vervollständigen Sie gekennzeichnete Programmteile wie in den Kommentaren beschrieben.
Verändern Sie aber nicht vorgegebene Methodenköpfe oder andere vorgegebene Programmteile!
Verwenden Sie die gegebenen Testklassen zum Überprüfen Ihrer Lösung. Die Korrektheit dieser Testfälle
ist notwendig, aber nicht hinreichend für eine korrekte Lösung. Es werden damit nur bestimmte
Spezialfälle geprüft. Liefern die Testklassen keinen Fehler, garantiert dies noch nicht die
Korrektheit Ihrer Lösung gemäß der Angabe.
*/

import org.w3c.dom.NodeList;

import java.util.Iterator;

public class Aufgabe2 {

    /*
    Aufgabe:
        Objekte der Klasse List stellen verkettete Listen von ganzen Zahlen mit
        Knoten vom Typ ListNode dar.
        Ergänzen Sie fehlende Teile der Klassen entsprechend den Kommentaren an
        den mit TODO gekennzeichneten Stellen.

    Punkte (maximal 20):
        10 Punkte für 'toStringFromIndex'.
        10 Punkte für 'removeLast'.
        Auch für teilweise korrekte Lösungen werden Punkte vergeben.
    */

    public static void main(String[] args) {
        // Implementierung von 'main' wird nicht beurteilt

        List myList = new List();
        myList.addLast(7);
        myList.addLast(1);
        myList.addLast(9);
        myList.addLast(3);
        myList.addLast(6);
        myList.addLast(5);

        System.out.println("Testen von toStringFromIndex:");
        System.out.println(myList.toStringFromIndex(0)); // [7,1,9,3,6,5]
        System.out.println(myList.toStringFromIndex(1)); // [1,9,3,6,5]
        System.out.println(myList.toStringFromIndex(3)); // [3,6,5]
        System.out.println();

        System.out.println("Testen von removeLast:");
        System.out.println(myList.removeLast()); // 5
        System.out.println(myList.toString()); // [7,1,9,3,6]

    }
}

// Repräsentiert einen Listenknoten. Wird von List benötigt.
class ListNode {

    // Es sind keine zusätzlichen Objekt-/globalen Variablen erlaubt.

    int elem;
    ListNode next = null;

    // Konstruktor
    ListNode(int elem, ListNode next) {
        this.elem = elem;
        this.next = next;
    }

    // Rekursive Hilfsmethode für 'addLast' von 'List'.
    public void addLast(int elem) {
        if(this.next == null) {
            this.next = new ListNode(elem, null);
        } else {
            this.next.addLast(elem);
        }
    }

    // Rekursive Hilfsmethode für 'toStringFromIndex' von 'List'.
    public String toStringFromIndex(int i) {

        String result = this.elem+"";
        if(this.next != null && i == 0) {
            result = result + "," + this.next.toString();
        }else {

            return this.next.toStringFromIndex(i - 1);
        }
        return result;


        // TODO: Implementieren Sie die Methode
    }


    // Rekursive Hilfsmethode für 'toString' von 'List'.
    public String toString() {
        String result = this.elem+"";
        if(this.next != null) {
            result = result + "," + this.next.toString();
        }
        return result;
    }

    //TODO: Platz für weitere rekursive Hilfsmethoden (falls benötigt).



}

// Repräsentiert eine Liste mit int-Werten.
class List {

    // Es sind keine zusätzlichen Objekt-/globalen Variablen erlaubt.

    // Zeiger auf den Kopf der Liste.
    private ListNode head = null;

    // Fügt das Element am Ende der Liste ein.
    public void addLast(int elem) {
        if(this.head == null) {
            head = new ListNode(elem, null);
        } else {
            this.head.addLast(elem);
        }
    }

    // Entfernt das zuletzt hinzugefügte Element aus der Liste und
    // liefert seinen Wert als Ergebnis zurück.
    // Liefert 'null' wenn die Liste leer ist.
    public Integer removeLast() {
        ListNode current = head;
        if (head == null) return null;
        if (current.next == null){
            Integer s = current.elem;
            head =null;
            return s;
        }
        while (current.next.next != null){
            current = current.next.next;
        }
        Integer s1 = current.next.elem;
        current.next =null;
        return s1;

        // TODO: Implementieren Sie die Methode
        // TODO: Diese Zeile entfernen.
    }

    // Retourniert alle Elemente der Liste ab dem Index i aufwärts
    // nach ihrem Index geordnet als String. Gibt es keine Elemente mit
    // dem Index i wird "[]" zurückgeliefert.
    // Vorbedingung: i >= 0
    public String toStringFromIndex(int i) {
        if(this.head == null){
            return "[]";
        }
        return "[" + this.head.toStringFromIndex(i) + "]";

    }

    // Retourniert alle Elemente der Liste nach ihrem Index geordnet als String.
    // Ist die Liste leer, wird "[]" zurückgeliefert.
    public String toString() {
        if(this.head == null){
            return "[]";
        }
        return "[" + this.head.toString() + "]";

    }
}


