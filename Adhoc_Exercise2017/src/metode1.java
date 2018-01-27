/**
 * Created by cehajicomar on 23.03.17.
 */
public class metode1 {
    public static void main(String[] args) {
        System.out.println("Prva cifra je:"+hochwertigste(911432230));
        System.out.println("Zbir brojeva djeljivih sa 11="+teilbar(22));
        System.out.println("Broj brojeva djeljivih sa 7u intervalu:"+interval(1,21));
    }
    public static int teilbar(int m){
        int sum=0;
        while(m>0){
            if(m%11==0){
               sum=sum+m;
            }
            m--;
        }
        return sum;
    }
    public static int hochwertigste(int a){
        while(a>=10){
            a=a/10;
        }
        return a;
    }
    public static int interval(int start,int end){
        int counter=0;
        while (start<=end){
            if (start%7==3){
                counter+=1;
                start++;
            }
            start++;
        }
        return counter;
    }
}
