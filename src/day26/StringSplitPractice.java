package day26;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {
        String students = "Abbos, Zulyar,Zhibek,Hasan,Muge, Orhan,Susan";
        students = students.replace(" ","");
        String [] namesArrays = students.split(",");
        System.out.println(Arrays.toString(namesArrays));

        for (int i = 0; i <namesArrays.length ; i++) {

            String studentNames = namesArrays[i];
            System.out.println("spelling name "+studentNames);

            for (int x = 0; x < studentNames.length(); x++) {
                System.out.print(studentNames.charAt(x)+" - ");

            }
            System.out.println();
        }
        }
}
