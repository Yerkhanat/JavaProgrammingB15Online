package day44;

public class SlackUser {
    protected String name ;
    protected String status;

    public void sendMesasge(){
        System.out.println("You message has been sent");


    }  public static void callSomeone(String friend){
        System.out.println("You are calling to your Friend" +friend);
    } public void addEmoji(){

        System.out.println(":-)");
    }



}
