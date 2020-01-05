package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParameter {
    public static void main(String[] args) {
        ArrayList<String> nameLst  = new ArrayList<String>();
        nameLst.add("Yerkhanat");
        nameLst.add("Janar");
        nameLst.add("Mongolia");
        printAlist(nameLst);
        List<String> lst11 = new ArrayList<String>();
        lst11.add("Kazakhstan");
        lst11.add("Russian");
        printAlist(lst11);
        longestName(lst11);


    }

    public static void printAlist(List<String> lst) {
        for (String each :
                lst) {
            System.out.println("each = " + each);

        }


    }
    public static void longestName(List<String> nameLst){
        String longestName = ""; //nameLst.get(0)

        for (int x = 0; x < nameLst.size(); x++) {

            String currentName = nameLst.get(x);
            // > will give you first longest name if you have more than one
            // >= will give you last longest name if you have more than one
            if (currentName.length() >= longestName.length()) {
                longestName = currentName;
            }

        }
        System.out.println("longestName = " + longestName);


    }
}
