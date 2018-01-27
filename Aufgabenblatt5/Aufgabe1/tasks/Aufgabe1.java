/*******************************************************************************

 AUFGABENBLATT 5 - Allgemeine Informationen

 Achten Sie bei der Implementierung auf folgende Punkte:

 - Ihr Programm sollte den dazugehörenden Test (z.B. enthält Aufgabe1Test den
 Test zu Aufgabe1) bestehen.

 - Bei einigen Aufgaben finden Sie Zusatzfragen. Diese Zusatzfragen beziehen
 sich thematisch auf das erstellte Programm. Sie müssen diese Zusatzfragen in
 der Übung beantworten können.

 - Verwenden Sie bei allen Ausgaben immer System.out.println().

 Abgabe: Die Abgabe erfolgt in TUWEL. Bitte laden Sie Ihr IntelliJ-Projekt
 bis spätestens Montag 15.05.2017 12:00 Uhr in TUWEL hoch. Zusätzlich
 müssen Sie in TUWEL ankreuzen welche Aufgaben Sie gelöst haben und während
 der Übung präsentieren können.

 ******************************************************************************/
/*
    Aufgabe 1) Klasse, Objekte, Methoden, Map verwenden - Tagesablaufplan

    Die Bewohner der fernen Insel haben beschlossen, sich von der klassischen
    Uhrzeit zu verabschieden. Stattdessen führen sie eine neue Uhrzeit ein, bei
    der ein Tag in 8 Achtel, ein Achtel in 100 Zentiachtel und ein Zentiachtel
    in 100 Ticks geteilt wird.
    Auf der Insel unterliegt ein großer Teil des Tages einem fixen
    Ablauf, z.B. "Sonnenaufgang betrachten" von 1.95.0 bis 2.5.0,
    "Frühstück" von 2.15.0 bis 2.30.0, "Muschelsammeln" von 3.0.0 bis 3.50.0,
    "Sonnenhut tragen" von 2.0.0 bis 6.0.0 und so weiter.
    Ein elektronischer Plan des Tagesablaufs soll Touristen vorgeblich helfen,
    sich einfacher anzupassen. Tatsächlich machen sich die Einwohner einen Spaß
    daraus, Fremde beim Anpassungsversuch zu beobachten. Daher kann man im Plan
    nur durch Eingabe der genauen Tätigkeit (z.B. "Sonnenaufgang betrachten")
    den dazugehörigen Zeitraum finden. Für zusätzliche Verwirrung sorgen
    unterschiedliche Pläne für unterschiedliche Touristen.

    Objekte der Klasse Aufgabe1 sollen Tagesablaufpläne für Touristen
    darstellen. Folgende Methoden werden benötigt:

    - from: hat einen Parameter vom Typ String, der einer Tätigkeit entspricht,
            und gibt die Beginn-Zeit der Tätigkeit als String (enthält eine neue
            Zeit) zurück; das Ergebnis ist null falls die Tätigkeit nicht
            vorgesehen ist.

    - to:   hat einen Parameter vom Typ String, der einer Tätigkeit entspricht,
            und gibt die Ende-Zeit der Tätigkeit als String zurück; das Ergebnis
            ist null falls die Tätigkeit nicht vorgesehen ist.

    - add:  wird für den schrittweisen Aufbau des Tagesablaufplans benötigt; der
            erste Parameter vom Typ String gibt eine Tätigkeit an, der zweite
            Parameter vom Typ Period (siehe unten) den Zeitaum dieser Tätigkeit;
            als Ergebnis kommt false zurück wenn für diese Tätigkeit vor Aufruf
            von add noch kein Zeitraum vorgesehen war, true wenn schon ein
            Zeitraum vorgesehen war, der durch den Aufruf von add ersetzt wird.

    - rem:  wird für das Entfernen von Tätigkeiten aus dem Tagesablaufplan
            benötigt; hat einen Parameter vom Typ String und gibt eine Tätigkeit
            an; als Ergebnis kommt "task removed" zurück wenn diese Tätigkeit
            erfolgreich entfernt wurde, bzw. "no entry" falls die entsprechende
            Tätigkeit nicht vorhanden war.
            
    Es soll möglich sein, mehrere Objekte von Aufgabe1 zu erstellen. Die Anzahl
    der Tätigkeiten in einem Tagesablaufplan darf nicht beschränkt sein (außer
    durch die Größe des Computer-Speichers).

    Objekte der Klasse Period stellen einen Zeitraum innerhalb eines Tages dar
    und enthalten die Beginn- und die Ende-Zeit jeweils als Objekte vom Typ
    String. Erzeugt werden Objekte von Period nur über einen Konstruktor, und
    zugegriffen wird nur über die folgenden parameterlosen Methoden:

    - from: gibt die Beginn-Zeit zurück.
    - to:   gibt die Ende-Zeit zurück.

    Hinweis: Sie können den Tagesablaufplan als Map/TreeMap realisieren.

    Zusatzfragen:
    1. Wozu benötigt man in dieser Aufgabe eine Klasse wie Period?
    2. Wodurch unterscheidet sich ein Array von einer Map?
    4. Muss man in jeder Klasse einen Konstruktor schreiben? Wenn nein, welche
       Konsequenzen hat es, wenn man keinen Konstruktor schreibt?
*/
import java.util.Map;
import java.util.HashMap;

class Period {
    private String Beginn;
    private String Ende;


    public Period(String beginn, String ende) {
        this.Beginn = beginn;
        this.Ende =  ende;
    }
    public String from() {
        return this.Beginn;
    }

   public String to() {
        return this.Ende;
    }
}

public class Aufgabe1 {

//from: hat einen Parameter vom Typ String, der einer Tätigkeit entspricht,
    //und gibt die Beginn-Zeit der Tätigkeit als String (enthält eine neue
    // Zeit) zurück; das Ergebnis ist null falls die Tätigkeit nicht vorgesehen ist.
    private Map<String, Period> tagesablaufplan = new HashMap<>();

    public String from(String activity) {

            return tagesablaufplan.get(activity).from();

    }
    public String to(String activity){
        return tagesablaufplan.get(activity).to();
    }

    //to:   hat einen Parameter vom Typ String, der einer Tätigkeit entspricht,
    //und gibt die Ende-Zeit der Tätigkeit als String zurück; das Ergebnis
    //ist null falls die Tätigkeit nicht vorgesehen ist.



    //add:  wird für den schrittweisen Aufbau des Tagesablaufplans benötigt; der
    //erste Parameter vom Typ String gibt eine Tätigkeit an, der zweite
    //Parameter vom Typ Period (siehe unten) den Zeitaum dieser Tätigkeit;
    //als Ergebnis kommt false zurück wenn für diese Tätigkeit vor Aufruf
    //von add noch kein Zeitraum vorgesehen war, true wenn schon ein
    //Zeitraum vorgesehen war, der durch den Aufruf von add ersetzt wird.


    public boolean add(String activity, Period period) {
        boolean works = tagesablaufplan.containsKey(activity);
        tagesablaufplan.put(activity, period);
        return works;
    }
    public String rem(String activity){
        if(tagesablaufplan.containsKey(activity)){
            tagesablaufplan.remove(activity);
            return "task removed";
        } else {
            return "no entry";
        }
    }

    public static void main(String[] args) {


    }
}


