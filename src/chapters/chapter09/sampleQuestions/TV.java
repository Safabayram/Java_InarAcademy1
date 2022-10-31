package chapters.chapter09.sampleQuestions;

public class TV {
    int channel;
    int volumeLevel;
    boolean on = false;


    public TV(){

    }
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }

    public void setChannel(int channel){
        if (on && channel >= 1 && channel <= 120){
            this.channel = channel;
        }

    }
    public void setVolumeLevel(int volumeLevel){
        if (on && volumeLevel >= 1 && volumeLevel <= 7){
            this.volumeLevel = volumeLevel;
        }
    }
    public void channelUp(){
        if (on && channel <= 120){
            channel++;
        }
    }
    public void channelDown(){
        if (on && channel > 1){
            channel--;
        }
    }
    public void volumeUp(){
        if (on && volumeLevel < 7){
            volumeLevel++;
        }
    }
    public void volumeDown(){
        if (on && volumeLevel > 1){
            volumeLevel--;
        }
    }


}
