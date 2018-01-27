/*
    Aufgabe 3) Zweidimensionale Arrays -- Vier Gewinnt

    Beim Spiel "Vier gewinnt" gewinnt der Spieler, der als erstes vier Steine
    in eine Reihe bringt (horizontal, vertikal, oder diagonal). Das Spielfeld
    steht senkrecht und ist 7 Spalten breit und 6 Reihen hoch. Steine können nur
    im untersten Feld einer Spalte platziert werden, das noch nicht von einem
    anderen Stein besetzt ist.

    "Vier gewinnt" wird in mehreren, aufeinander aufbauenden Aufgaben in
    mehreren Aufgabenblättern verwendet, Sie sollten daher diese Aufgaben
    unbedingt lösen.
    
    Hinweis: Sie können Hilfsmethoden implementieren, dürfen aber vorgegebene
             Methoden und deren Signaturen nicht verändern.
    
    
    Beschreibung:
    
    (GEGEBEN) -- public static int[][] spielfeld()
    
    Diese Methode erzeugt ein leeres Vier-Gewinnt-Spielfeld. Das Spielfeld wird
    als zweidimensionales Array von int-Werten dargestellt, wobei auf ein Feld
    in Reihe r und Spalte s im Feld f mit f[r][s] zugegriffen wird. Ein leeres
    Feld wird mit 0 repraesentiert, ein Stein auf einem Feld durch 1 für einen
    Stein des Spielers 1 bzw. 2 für einen Stein des Spielers 2.


    (GEGEBEN) -- public static void spielstand(int[][] f)
    
    Diese Methode gibt den Spielstand f in folgender Form aus:
    
    |       |
    |       |
    |       |   Definition: Die linke unterste Ecke ist als Koordinate [0][0]
    |       |               definiert und stellt den Ausgangspunkt des
    |  xo   |               Spielbrettes dar.
    |  ox   |
    +-------+
    
    wobei für ein leeres Feld ein Leerzeichen ausgegeben wird, für einen Stein
    von Spieler 1 ein x, und für einen Stein von Spieler 2 ein o.

    (ZU IMPLEMENTIEREN) --  public static int[][] zug(int[][] f, int spieler, int spalte)

    Diese Methode führt einen Zug des Spielers "spieler" in Spalte "spalte"
    (0-6 für legale Züge) durch und gibt die neue Stellung (das Spielfeld nach
    dem Zug) zurück.  Wenn in Spalte "spalte" kein Zug möglich ist (weil die
    Spalte voll ist oder nicht im erlaubten Bereich), soll zug() null
    zurückgeben. Das vom Parameter f referenzierte Feld darf verändert werden
    oder unverändert bleiben.


    (ZU IMPLEMNTIEREN) -- public static boolean sieg(int[][] f, int spieler)

    Diese Methode liefert true, wenn "spieler" vier Steine in einer Reihe hat,
    sonst false.


    (GEGEBEN) -- public static void spiel()

    Diese Methode führt ein Vier-Gewinnt-Spiel zwischen zwei Spielern durch:
    Beginnend mit einem leeren Spielfeld werden abwechselnd Spieler 1 und
    Spieler 2 zur Eingabe eines Spielzuges aufgefordert, der Spielzug
    durchgeführt, und der aktuelle Spielstand ausgegeben, solange bis ein
    Spieler gewonnen hat oder das Spielfeld voll ist.
*/
import java.util.Scanner;
public class Aufgabe3 {
    
    public static int[][] spielfeld(){
        return new int[6][7]; //default 0 initialisiert
    }
    
    public static void spielstand(int[][] f){
        for(int y = f.length-1; y >= 0; y--){
            System.out.print("|");
            for(int x : f[y]){
                switch(x){
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("x");
                        break;
                    case 2:
                        System.out.print("o");
                        break;
                }
            }
            System.out.println("|");
        }
        System.out.println("+-------+");
    }

    public static int[][] zug(int[][] f, int spieler, int spalte){
        if(spalte<0      || spalte>6){
            return null;
        }else {
            for(int i=0;i<f.length;i++){
                if(f[i][spalte]==0){
                    f[i][spalte]=spieler;
                    return f;
                }
            }
            return null;
        }

    }
    
    public static boolean sieg(int[][] f, int spieler) {
        //waagrecht
        for(int i=0;i<f.length;i++){
            int counter=0;
            for(int j=0;j<f[i].length;j++) {
                if(f[i][j]==spieler){
                    counter++;
                }else {
                    counter=0;
                }
                if (counter ==4){
                    return true;
                }
            }
        }
        // senkrecht
        for(int i=0;i<f[0].length;i++){
            int counter=0;
            for(int j=0;j<f.length;j++) {
                if(f[j][i]==spieler){
                    counter++;
                }else {
                    counter=0;
                }
                if (counter ==4){
                    return true;
                }
            }
        }

        for (int j = 0; j < f[0].length; j++) {
            int counter = 0;
            for (int x = 0, y = j; x < f.length && y < f[0].length; x++, y++) {

                if (f[x][y] == spieler) {

                    counter++;

                } else {
                    counter = 0;
                }

                if (counter == 4) {

                    return true;

                }
            }
        }

        for (int i = 0; i < f.length; i++) {

            int counter = 0;
            for (int x = i, y = 0; x < f.length && y < f[0].length; x++, y++) {

                if (f[x][y] == spieler) {

                    counter++;

                } else {
                    counter = 0;
                }

                if (counter == 4) {

                    return true;

                }
            }

        }

        for (int i = 0; i < f.length; i++) {

            int counter = 0;
            for (int x = i, y = 0; x < f.length && y >= 0; x++, y--) {

                if (f[x][y] == spieler) {

                    counter++;

                } else {
                    counter = 0;
                }

                if (counter == 4) {

                    return true;

                }
            }

        }
        for (int j = 0; j < f[0].length; j++) {
            int counter = 0;
            for (int x = 0, y = j; x < f.length && y >= 0; x++, y--) {

                if (f[x][y] == spieler) {

                    counter++;

                } else {
                    counter = 0;
                }

                if (counter == 4) {

                    return true;

                }
            }
        }


        return false; //diese Anweisung ändern oder löschen.
    }

    public static void spiel(){
        Scanner sc = new Scanner(System.in);
        int[][] game = spielfeld();
        int[][] res;
        boolean won = false;
        int round_count = 0;
        int spieler = 1;
        do{
            spielstand(game);
            System.out.println("Spieler " + spieler + ", bitte Spalte für Einwurf auswählen (1-7): ");
            if(!sc.hasNextInt()){
                if(!sc.hasNext()){
                    return;
                }
                System.out.println("Ungültige Eingabe.");
                sc.next();
                continue;
            }
            int input = sc.nextInt() - 1;
            res = zug(game, spieler, input);
            if(res == null){
                System.out.println("Ungültige Eingabe oder Spalte bereits voll.");
                continue;
            }
            else{
                round_count++;
            }
            won = sieg(res, spieler);
            if(!won){
                spieler++;
                if(spieler == 3){
                    spieler = 1;
                }
            }
            game = res;
        } while(!won && round_count < 42);
        spielstand(game);
        if(won){
            System.out.println("Spieler " + spieler + " hat gewonnen!");
        }
        else{
            System.out.println("Unentschieden!");
        }
    }
    
    public static void main(String[] args) {
        spiel();
    }
}

