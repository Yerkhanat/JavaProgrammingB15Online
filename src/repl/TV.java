package repl;

public class TV {

    private int channelLevel =1;
    private int volumeLevel =1;
    private boolean on = false;
    private String brand = "undefined";

    public TV(){
        System.out.println("Creating TV object using no Args- constructor");
    } public TV(String brand){
        System.out.println("Creating TV object using 1 arg - constructor");
        this.brand =brand;
    }

    public void setVolumeLevel(int volumeLevel){

        if(on && volumeLevel >= 1 && volumeLevel <=7){
            this.volumeLevel = volumeLevel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }


    } public int getVolumeLevel(){
        return this.volumeLevel;
    }  public void setChannel(int channelLevel){
        if(channelLevel>=0 && channelLevel<=120 && on) {
            this.channelLevel = channelLevel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public int getChannel(){
        return this.channelLevel;
    } public void setBrand(String brand){
        this.brand = brand;
    } public String getBrand(){
        return this.brand;
    }
    public void channelUp(){
        this.channelLevel++;
    }public void channelDown(){
        this.channelLevel--;
    } public void volumeUp(){
        this.volumeLevel++;
    }public void volumeDown(){
        this.volumeLevel--;
    } public void turnOn(){
        if(this.on){
            System.out.println("TV is already ON");
        }else {
            this.on =true;
        }

    }public void turnOff(){
        if(!this.on){
            System.out.println("TV is already OFF");
        } else {
            this.on = false;
        }

    }


}

