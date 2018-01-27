/**
 * Created by cehajicomar on 13.05.17.
 */
public class TestTv {
    public static void main(String[] args) {
        TV tv1=new TV();
        tv1.turnON();
        tv1.setchanell(21);
        tv1.setVolume(3);

        TV tv2= new TV();
        tv2.turnON();
        tv2.volumup();
        tv2.chanellup();
        tv2.chanellup();

        System.out.println("tv1 chanel"+ tv1.chanell+ "tv1 volume"+tv1.volumelevel);
        System.out.println("tv2 chanel"+ tv2.chanell+ "tv2 volume"+tv2.volumelevel);
    }
}
