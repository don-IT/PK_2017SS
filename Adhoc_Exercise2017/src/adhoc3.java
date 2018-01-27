/**
 * Created by cehajicomar on 07.04.17.
 */
public class adhoc3 {

    public static void main(String[] args) {
       calcMultiTable(3,8, 3);
       //canatitor(3);
       //add(4,8);
    }

    public static void canatitor(int n){

        for(int spalte=1;spalte<=n;spalte++){
            for(int j=1;j<=spalte;j++){
                String a=""+j+"/"+ (spalte-(j-1))+" ";
                System.out.print(a);
            }
            System.out.println();
        }

    }

    public static void addtabele(int start , int ende){
        int s =start+start;
        int e=ende+ende;
        for (;s<=e-(start+start);s++){
            for (int m=s;m<=s+start+start;m++){
                System.out.print("\t"+m);
            }
            System.out.println();
        }
    }
    public static void add(int a,int b){
        for(int i=a;i<=b;i++){
            for (int c=a;c<=b;c++){
                System.out.print((c+i)+"\t");
            }
            System.out.println();
        }
    }

    public static int rekursivpreodukt(final int a ,final int b){
        return b>0? a+ rekursivpreodukt(a,b-1):0;
    }

public static void calcMultiTable(int start, int ende,int a){
    System.out.print(" "+"\t");
    for(int i=start;i<=ende;i++){
        System.out.printf("\t"+i);
    }
    System.out.println();
    System.out.print("  ---+");
    for(int j=start;j<=ende;j++){
        System.out.print("----");
    }
    System.out.println();
    for(int z=start;z<=ende;z++){
        System.out.print("   "+z+" "+"|");
        for(int y=start;y<=ende;y++){
            System.out.print("\t"+z*y);
        }
        System.out.println();
    }
}
}
