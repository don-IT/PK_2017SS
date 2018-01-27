/*
    Aufgabe 3) Zweidimensionale Arrays -- Vier Gewinnt

    Fortsetzung des "Vier gewinnt" Spiels aus Aufgabenblatt 4. Kopieren Sie
    sich dazu die Methoden spielfeld(), spielstand(), zug(), und sieg() aus
    Aufgabenblatt 4, um die weiteren Funktionalitäten in diesem Aufgabenblatt
    zu lösen. Auch auf diese Aufgaben werden spätere Aufgabenblätter aufbauen,
    Sie sollten sie daher unbedingt lösen.
    
    Hinweis: Sie können Hilfsmethoden implementieren.
    
    Beschreibung:

    (ZU IMPLEMENTIEREN) -- public static int wert1(int[][] f, int spieler)
    
    Diese Methode nimmt eine naive* Stellungsbewertung der Position von Spieler
    "spieler" vor: Es zählt die Zweier-Reihen, Dreier-Reihen, und Vierer-Reihen
    aus Steinen des Spielers "spieler". Der zurückgegebene Wert ist
    1*z+100*d+10000*v, wobei z die Zahl der Zweier-Reihen, d die Zahl der
    Dreier-Reihen, und v die Zahl der Vierer-Reihen ist.
    
    *) Eine einigermassen gute Stellungsbewertung würde den Rahmen der
    Übung sprengen.
    
    Für die Stellung
    
    |       |
    |       |
    |       |
    |  o    |
    |  xo   |
    |  oxoxx|
    +-------+
    
    ist die Bewertung für Spieler 1 (x) 1*2=2 und fuer Spieler 2 (o)
    1*3+100*1=103.  Eine Dreier-Reihe zählt also auch noch als
    zwei Zweier-Reihen.


    (ZU IMPLEMENTIEREN) -- public static int wert(int[][] f, int spieler)
    
    Die Methode bezieht den wert1() des Gegners in die Bewertung mit ein: Vier
    gewinnt ist (wie die meisten Brettspiele) ein Null-Summen-Spiel
    (Spieler 1 gewinnt, wenn Spieler 2 verliert, und umgekehrt), daher
    soll wert() die Differenz von wert1() des Spielers und wert1() des
    Gegners zurückgeben, im obigen Beispiel also -101 für Spieler 1 (oder
    101 für Spieler 2).


    (ZU IMPLEMENTIEREN) -- public static int negamax(int[][] f, int spieler, int tiefe)
    
    Eine bessere Stellungsbewertung kann man aus wert() ableiten, indem
    man einige Halbzüge vorausschaut. Bei einem Halbzug Vorausschau
    bewertet man die Stellung, die sich bei jedem der 7 möglichen Züge
    ergibt, wie folgt: Der Spieler, der am Zug ist, wird den für ihn
    besten Zug auswählen, der Wert der ursprünglichen Stellung ist also
    das Maximum der Werte der sieben möglichen Folgestellungen. Wenn man
    das für mehrere Halbzüge verallgemeinert, muss man nach jedem Halbzug
    die Seite wechseln, und für den Spieler, der dann am Zug ist, das
    Maximum berechnen. Um diesen Wert dann als Bewertung fuer den anderen
    (vorherigen) Spieler zu verwenden, muß man ihn negieren. Dieser
    Algorithmus heißt "Negamax".

    Diese rekursive Methode "negamax" führt eine Stellungsbewertung für Spieler
    "spieler" mit "tiefe" Zügen Vorausschau durch. Bei 0 Zügen Vorausschau soll
    die Bewertung wert() verwendet werden.
    
    Für diese Methode benötigen Sie eine Möglichkeit, Züge zu probieren,
    ohne sich darauf festzulegen, entweder indem Sie den alten Wert von f
    erhalten, oder indem Sie nach dem Probieren den Zug wieder
    zurücknehmen.  Wenn nötig, modifizieren Sie existierende Methoden
    und/oder implementieren Sie Hilfsmethoden, um das zu erreichen.

    ZU IMPLEMENTIEREN) -- public static int bester(int[][] f, int spieler, int tiefe)

    Diese Methode wählt den besten Zug aus. Alle 7 möglichen Züge
    werden durchprobiert, und die sich dadurch ergebende Stellung f1 wird mit
    Hilfe von negamax() bewertet (beachten Sie, welcher Spieler am Zug
    ist). Der Rückgabewert ist ein Zug mit maximaler Bewertung.
    
    Zusatzfragen:
    1. Was sind die Vor- und Nachteile der von Ihnen gewählten
       Art, nach dem Probieren wieder zum vorherigen Zug zu kommen?
    2. Ermitteln Sie durch Ausprobieren und ungefähre Zeitmessung, wie der
       Zeitaufwand von bester() mit der Tiefe zusammenhängt.
    3. Wieviele Aufrufe von wert() werden höchstens ausgeführt, wenn man
       bester() mit Tiefe 0, 1, 2, 8 und n aufruft?
 

    (GEGEBEN) -- public static void spiel1(int tiefe)

    Diese Methode führt ein Vier-Gewinnt-Spiel Spieler gegen Computer durch:
    Zunächst sucht sich der Spieler aus, ob er beginnt oder der Computer. Wenn
    der Computer am Zug ist ist, wählt er den nächsten Zug mit bester(...,
    tiefe) aus und führt ihn durch.  Abgesehen davon macht spiel1() das
    gleiche wie spiel(). Probieren Sie verschiedene Werte für tiefe aus,
    und wählen Sie einen, bei dem der Computer im Normalfall zwischen 0.1s
    und 1s zur Auswahl des besten Zugs braucht. Testen Sie die Methode,
    indem Sie gegen den Computer spielen.
*/
import java.util.Scanner;
public class Aufgabe3 {
    
    public static int wert1(int[][] f, int spieler){
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (i <= 2 && f[i][j] == spieler && f[i + 1][j] == spieler && f[i + 2][j] == spieler && f[i + 3][j] == spieler) {
                    sum += 10000;
                }
                if (i <= 3 && f[i][j] == spieler && f[i + 1][j] == spieler && f[i + 2][j] == spieler) {
                    sum += 100;
                }
                if (i <= 4 && f[i][j] == spieler && f[i + 1][j] == spieler) {
                    sum += 1;
                }
                if (i <= 2 && j <= 3 && f[i][j] == spieler && f[i + 1][j + 1] == spieler && f[i + 2][j + 2] == spieler && f[i + 3][j + 3] == spieler) {
                    sum += 10000;
                }
                if (i <= 3 && j <= 4 && f[i][j] == spieler && f[i + 1][j + 1] == spieler && f[i + 2][j + 2] == spieler) {
                    sum += 100;
                }
                if (i <= 4 && j <= 5 && f[i][j] == spieler && f[i + 1][j + 1] == spieler) {
                    sum += 1;
                }
                if (j <= 3 && f[i][j] == spieler && f[i][j + 1] == spieler && f[i][j + 2] == spieler && f[i][j + 3] == spieler) {
                    sum += 10000;
                }
                if (j <= 4 && f[i][j] == spieler && f[i][j + 1] == spieler && f[i][j + 2] == spieler) {
                    sum += 100;
                }
                if (j <= 5 && f[i][j] == spieler && f[i][j + 1] == spieler) {
                    sum += 1;
                }
                if (i >= 3 && j <= 3 && f[i][j] == spieler && f[i - 1][j + 1] == spieler && f[i - 2][j + 2] == spieler && f[i - 3][j + 3] == spieler) {
                    sum += 10000;
                }
                if (i >= 2 && j <= 4 && f[i][j] == spieler && f[i - 1][j + 1] == spieler && f[i - 2][j + 2] == spieler) {
                    sum += 100;
                }
                if (i >= 1 && j <= 5 && f[i][j] == spieler && f[i - 1][j + 1] == spieler) {
                    sum += 1;
                }
            }
        }
        return sum; }
    
    public static int wert(int[][] f, int spieler){
        if (spieler == 1) {
            return wert1(f, 1) - wert1(f, 2);
        } else {
            return wert1(f, 2) - wert1(f, 1);
        }
    }
    
    public static int negamax(int[][] f, int spieler, int tiefe){
        if(tiefe==0){
            return wert(f,spieler);

            }
            int best=wert(f,spieler);
        int neuewert;
        for(int i=0;i<f[0].length; i++){
            if(f[5][i] == 0){
                neuewert = -negamax(zug(f, spieler, i), spieler == 1 ? 2 : 1, tiefe -1);
                if(neuewert > best)
                    best = neuewert;
                rem(f, i);
            }
        }
        return best; //diese Anweisung ändern oder löschen.
    }
    
    

        public static int bester(int[][] f, int spieler, int tiefe) {
            int wert = wert(f, spieler);
            int row = 0;

            if (tiefe == 0) {
                return wert;
            }

            int max = wert;
            for (int i = 0; i <= f[0].length-1; i++) {
                if (f[f.length - 1][i] == 0) {
                    wert = negamax(zug(f, spieler, i), spieler, tiefe-1);
                    if (max < wert) {
                        max = wert;
                        row = i;
                    }
                    rem(f,i);
                }
            }
            return row;
        }
    public static int[][] rem(int[][]f, int spalte){

        if(spalte < 0 || spalte >= f[0].length)
            return null;

        if(f[f.length-1][spalte] != 0){
            f[f.length-1][spalte] = 0;
            return f;
        }

        int i = 0;
        while(f[i][spalte] != 0)
            i++;


        f[i - 1][spalte] = 0;
        return f;


    }


    public static void spiel1(int tiefe){
        Scanner sc = new Scanner(System.in);
        int[][] game = spielfeld();
        boolean won = false;
        int spieler = 1; // alternating 1,2
        System.out.println("Wer soll beginnen? (\"ich\" / \"com\"): ");
        String read = sc.next();
        if ("ich".equals(read))
            spieler = 1;
        else if ("com".equals(read))
            spieler = 2;
        else {
            System.out.println("Ungültige Eingabe. Spiel wird beendet.");
            return;
        }
        int round_count = 0;
        do {
            spielstand(game);
            if (spieler == 2) {
                // computer's turn:
                int index = bester(game, spieler, tiefe);
                if (index == -1) {
                    System.out.println("Computer findet kein freies Feld. Beende spiel.");
                    return;
                }
                zug(game, spieler, index);
                round_count++;
            } else {
                System.out.println("Bitte Spalte für Einwurf auswählen (1-7): ");
                if (!sc.hasNextInt()) {
                    if (!sc.hasNext()) return;
                    System.out.println("Ungültige Eingabe.");
                    sc.next(); // consume
                    continue; // try over
                }
                int input = sc.nextInt() - 1;
                int[][] res = zug(game, spieler, input);
                if (res == null) {
                    System.out.println("Ungültige Eingabe oder Spalte bereits voll.");
                    continue; // try over
                }
                else{
                    round_count++;
                }
            }
            won = sieg(game, spieler);
            if (!won) {
                spieler++;
                if (spieler == 3) spieler = 1;
            }
        } while(!won && round_count < 42);
        spielstand(game);
        if(round_count == 42 && !won){
            System.out.println("Unentschieden!");
        }
        else if (spieler == 1){
            System.out.println("Gratulation! Sie haben gewonnen!");
        }
        else{
            System.out.println("Der Computer hat gewonnen.");
        }
    }
    public static int[][] zug(int[][] f, int spieler, int spalte){
        if (spalte < 0 || spalte > 6){
            return null;
        }
        if (f[5][spalte] != 0){
            return null;
        }
        int r = 0;
        while(f[r][spalte] != 0){
            r++;
        }
        f[r][spalte] = spieler;
        return f;
    }

    public static boolean sieg(int[][] f, int spieler) {
        // first, check 4-in-a-row:
        for (int r = 0; r <= 5; r++) {
            int cont = 0;
            for (int c = 0; c <= 6; c++) {
                if (f[r][c] == spieler){
                    cont++;
                }
                else {
                    cont = 0;
                }
                if (cont == 4) {
                    return true;
                }
            }
        }

        // now, check 4-in-a-column:
        for (int c = 0; c <= 6; c++) {
            int cont = 0;
            for (int r = 0; r <= 5; r++) {
                if (f[r][c] == spieler){
                    cont++;
                }
                else{
                    cont = 0;
                }
                if (cont == 4) {
                    return true;
                }
            }
        }

        // then, check 4-in-a-positive-diagonal:
        for (int d = -2; d <= 3; d++) {
            int cont = 0;
            for (int r = 0; r <= 5; r++) {
                int c = r + d;
                if (c >= 0 && c <= 6) {
                    if (f[r][c] == spieler) {
                        cont++;
                    } else {
                        cont = 0;
                    }
                    if (cont == 4) {
                        return true;
                    }
                }
            }
        }

        // finally, check 4-in-a-negative-diagonal:
        for (int d = 3; d <= 8; d++) {
            int cont = 0;
            for (int r = 5; r >= 0; r--) {
                int c = d - r;
                if (c >= 0 && c <= 6) {
                    if (f[r][c] == spieler) {
                        cont++;
                    } else {
                        cont = 0;
                    }
                    if (cont == 4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
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



    public static void main(String[] args) {
        spiel1(1);
    }
    
}

