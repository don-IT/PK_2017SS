/**
 * Created by cehajicomar on 25.04.17.
 */
public class besseralsdiana {
    public static void main(String[] args) {
        calcMultiTable(3,8);
    }
    public static void calcMultiTable(int start, int ende){
        System.out.printf(" "+"\t");
        for(int i=start;i<=ende;i++){
            System.out.printf("\t"+i);
        }
        System.out.println();
        System.out.printf("  ---+");
        for(int j=start;j<=ende;j++){
            System.out.printf("----");
        }
        System.out.println();
        for(int z=start;z<=ende;z++){
            System.out.printf("   "+z+" "+"|");
            for(int y=start;y<=ende;y++){
                System.out.printf("\t"+z*y);
            }
            System.out.println();
        }

    }
}