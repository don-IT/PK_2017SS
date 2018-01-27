/**
 * Created by cehajicomar on 13.05.17.
 */
public class TV {
    int chanell=1;
    int volumelevel=1;
    boolean on=false;
    public TV(){

    }
    public void turnON(){
        on=true;
    }
    public void turnoff(){
        on=false;
    }
    public void setchanell(int newChanel){
        if(on && newChanel>=1 && newChanel<=120){
            chanell=newChanel;
        }
    }
    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7){
            volumelevel = newVolumeLevel;
        }
    }
    public void chanellup(){
        if(on&&chanell<=120){
            chanell++;
        }
    }
    public void volumup(){
        if(on&&volumelevel<7){
            volumelevel++;
        }
    }
}
