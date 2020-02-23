package day60;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class DangerZoneAgain2 {
    public static void main(String[] args) throws InterruptedException  {//FileNotFoundException,

       readMyFile();
        Thread.sleep(3000);
        System.out.println("The End");


    }
    // document this method to tell the caller, the file you are about tot read might not exists
    // and handle the consequences yourself
    public static void readMyFile()  {
     System.out.println("Reading file in my computer");
        try {
           // throw new FileNotFoundException("Kaboom! file is not here!!!");
          List<String> allLines=  Files.readAllLines(Paths.get("src/Hero.txt"));
            System.out.println(allLines);
        } catch (IOException e) {
            System.out.println("handled in method");
        }
    }
}
