package day44.Sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {

    int adminId;

    public SlackAdminUser(String name, String status, int adminId){

        this.name=name;
        this.status = status;
        this.adminId =adminId;
    }

    public void sendAtChanneMessage(){
        System.out.println("You have sent message to Admin");
    }public void deleteMessage(){
        System.out.println("You have deleted the message from "+this.name);
    }public void addChannel(String yourChannel){

        System.out.println("You channel is created by name: "+yourChannel);
    }

    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SlackAdminUser s1 = new SlackAdminUser("Yerqa", "Active",3);

        s1.sendAtChanneMessage();
        s1.addChannel("@besties");
        s1.deleteMessage();
        s1.addEmoji();
        callSomeone(" Janar");
        System.out.println(s1);
    }
}
