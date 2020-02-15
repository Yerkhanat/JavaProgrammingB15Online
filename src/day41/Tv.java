package day41;

public class Tv {
    String brand;
    boolean isOn;
    int currentChannel;

    public void turnOn(){
    if (!isOn) {
        System.out.println("Turning on Tv" );
        isOn = true;
    }
    }public void turnOf(){
        if(isOn){
            System.out.println("Turning off Tv");
            isOn=false;
        }


    }public int  getCurrentChannel(){
        return currentChannel;
    }
    public void setCurrentChannel(int newcurrentChannel) {

        if (newcurrentChannel>=0 && newcurrentChannel<=50 ) {

            if (isOn) {
                currentChannel = newcurrentChannel;
                System.out.println("You set your channel to \""+currentChannel+"\"");
            } else {
                System.out.println("Turn on Tv first");
            }
        }else {
            System.out.println("Invalid channel");
            return;

        }

    }
    public void moveForward(){
        currentChannel++;
    }
    public void moveBackward(){
        currentChannel--;
    }


    public String toString(){

        return "Tv Brand is = "+brand +" | "+ " Tv is on "+isOn+
                " | "+ "current channel number is "+currentChannel;

    }


}
