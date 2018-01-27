/**
 * Created by cehajicomar on 13.05.17.
 */
public class array12 {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1,2,3,4}, {5,6,7},{8,9},{0,1,2,3,4},{1,2,3,5,6}};
        System.out.println(create(a,4));
    }
    public static int create(int[][] ar, int j) {
        for (int i =0; i< ar.length-1; i++) {
            if(ar[i+1].length-1 < j) {
                return i+1;
            }
            if (i+1 == ar.length-1) {
                return 4;
            }
        }
        return 0;
    }
}