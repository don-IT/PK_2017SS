/**
 * Created by cehajicomar on 02.04.17.
 */
public class zadaca {
    public static void main(String[] args) {
        System.out.println(simpler((short)333));
    }
    public static long simpler(short n){
        long a=1L;
        long result=0L;
        long i =n%10;
            while (n>0&& i>=0){
                long b=n%10;
                if(b==0 ) {
                    n/=10;
                    result+=1L;
                    i=n%10;

                }else if(i>0){
                    a=a*10;
                    --i;
                }else if(i==0){
                    n/=10;
                    result+=a;
                    a=1L;
                    i=n%10;
                }

            }
            return result;
        }
}
