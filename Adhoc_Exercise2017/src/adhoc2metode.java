/**
 * Created by cehajicomar on 01.04.17.
 */
public class adhoc2metode {
    public static void main(String[] args) {
       // System.out.println(inrange(6,7));
       // System.out.println(wierlogic(true,true));
       // System.out.println(useswitch(1));
        System.out.println(inrang(32,-2));
    }
    public static boolean inrange(int x, int y){
        boolean a=true;
        return x<=20&&x>=1&&y<=20&&y>=1&&x>y?a:false;
    }
    public static int wierlogic(boolean a,boolean b){
        return a!=b?0:(a==true&&a==b?-1:1);
    }
    public static boolean useswitch(int i){
        switch (i*i-i){
            case 0:
                return false;
            case 2:
                return false;
            case 12:
                return false;
            case 19:
                return false;

        }
        return true;
    }
    public static boolean inrang(int x,int y){
        return x>=y&&x<=y*y?true:false;
    }


}
