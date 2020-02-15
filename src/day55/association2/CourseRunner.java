package day55.association2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>(Arrays.asList("Muge", "Sumeye", "Hasan","Astrit", "Vlad","Zehra"));
        Course c1 =new Course("Java",lst);

        System.out.println(c1);
        c1.studentNames.add("Yerkhanat");
        System.out.println(c1);


    }
}
