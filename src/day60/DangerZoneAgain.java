package day60;

import java.io.FileNotFoundException;


public class DangerZoneAgain  {
    public static void main(String[] args) throws InterruptedException  {//FileNotFoundException,

        try {
            readMyFile();
        } catch (FileNotFoundException e) {
            System.out.println("handling here");
        }
        Thread.sleep(3000);
        System.out.println("The End");


    }
    // document this method to tell the caller, the file you are about tot read might not exists
    // and handle the consequences yourself
    public static void readMyFile() throws FileNotFoundException {
     System.out.println("Reading file in my computer");
     throw new FileNotFoundException("Kaboom! file is not here!!!");
 }
}
