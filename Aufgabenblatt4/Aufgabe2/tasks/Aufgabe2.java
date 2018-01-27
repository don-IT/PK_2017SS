/*
    Aufgabe 2) Rekursion und Termination

    Die Methoden f, g, h, p und q sind vorgegeben. Rufen Sie in main jede
    dieser Methoden mit allen Argumenten im Bereich von ]-10, 10[ (in
    aufsteigender Reihenfolge) auf und geben sie die Ergebnisse aus, wenn die
    Aufrufe mit diesen Werten terminieren. Aufrufe, die nicht terminieren
    würden, sind auszulassen. Vermeiden Sie Exceptions.

    Zusatzfragen:
    1. Beschreiben Sie überblicksartig, was die Methoden f, g, h, p und q
    berechnen.
    2. Nennen Sie für jeden nicht terminierenden Aufruf von f, g, h, p und q im
    Intervall ]-10, 10[ einen Grund für die Endlosrekursion.
    2. Bedeutet ein StackOverflowError immer, dass eine Endlosrekursion
    vorhanden ist?
*/
public class Aufgabe2{
    
    private static int f(int x) {
        return x * x > 9 ? 0 : f(x - 1) + 1;
    }
    
    private static int g(int x) {
        return x < 0 ? 0 : g(x / 2) + 1;
    }
    
    private static int h(int x) {
        return x > 9 ? 0 : h(x * x) + 1;
    }
    
    private static int p(int x) {
        return x == 0 ? 0 : x % 2 == 1 ? p(x / 2) + 2 : p(- x - 1) + 1;
    }
    
    private static int q(int x) {
        return x % 3 == 0 ? 0 : q(x + x % 3 + 1) + 1;
    }
    
    public static void main(String[] args) {
        System.out.println("Ergebnisse für f:");
        for(int a=-9;a<10;a++){
            System.out.println(f(a));

        }


        System.out.println("Ergebnisse für g:");
        for(int a=-9;a<10;a++){
            if(a<0){
            System.out.println(g(a));
            }else{
                break;
            }
        }
        System.out.println("Ergebnisse für h:");
        for(int a=-9;a<10;a++){
            if(a<-1||a>1) {
                System.out.println(h(a));
            }
            }
        System.out.println("Ergebnisse für p:");
        for(int a=-9;a<10;a++) {
            if(a%3!=0 && a%2==0 && a<0){
                System.out.println(p(a));
            }
            if(a>=-1 && a<=1){
                System.out.println(p(a));
            }
            if(a>1 && a!=9 && a%2==1 && a/2!=2){
                System.out.println(p(a));
            }
            }
        System.out.println("Ergebnisse für q:");
        for(int a=-9;a<10;a++) {

            if(a%3==1|| a%3==0 || a%3==-2  ){
                System.out.println(q(a));
            }
        }
    }
}

