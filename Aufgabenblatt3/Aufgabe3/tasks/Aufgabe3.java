/*
    Aufgabe 3) Rekursion in Iteration ändern

    Stellen Sie fest, was die Methode 'rec' macht. Schreiben Sie eine statische
    Methode 'iter', die das Gleiche macht wie 'rec'
    (gleiches Input-Output-Verhalten), aber ohne Rekursion auskommt.

    Zusatzfragen:
    1. Warum ist es notwendig, negative Parameterwerte getrennt zu behandeln?
    2. Warum ist es notwendig, 0 als Sonderfall zu behandeln?
    3. Ist es immer vernünftig, sich an die Hinweise einer IDE zu halten?
    
*/
public class Aufgabe3 {
    
    //Was berechnet "rec"?
    public static int rec(int x, int y) {
        if (x < 0) {
            return rec(-x, y);
        }
        if (y < 0) {
            return rec(x, -y);
        }
        if (x == 0) {
            return 0;
        }
        if (x > y) {
            return rec(y, x);
        }
        if (x == y) {
            return x;
        }
        return rec(x, y - x);
    }
    
public static int  iter(int a,int b){
     a=a < 0 ? -a : a;
    b=b < 0 ? -b : b;

    while(a!=b){
        if (a==0){
        return 0;
    }
        if(a>b){
            int c=a;
            a=b;
             b=c;
        }else {
            b = b - a;
        }
    }
    return a;

}
    public static void main(String[] args) {
        System.out.println(rec(-1,0));
        System.out.println(iter(-1,0));

    }
}

