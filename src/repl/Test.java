package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String rvr= "AEF6$5#$f%f";
        char [] arr1 = rvr.toCharArray();
        System.out.println(arr1[0]);

        ArrayList<Boolean> s1 = new ArrayList<>(Arrays.asList(true, false, false));

        ArrayList<Boolean> modified = new ArrayList<>(s1);
        for (int i = 0; i < s1.size(); i++) {
            modified.add(s1.get(i));

        }
        System.out.println(modified);
        String s = "12";
        Character y = '2';
        String x = Character.toString(y);
        s.toCharArray();


        ArrayList<String[]> arr = new ArrayList<String[]>();
        arr.add(new String[]{"1", "title 1", "content"});
        arr.add(new String[]{"2", "title 2", "content"});
        arr.add(new String[]{"3", "title 3", "content3"});
        int count = 0;

        for (int i = 0; i < arr.size(); i++) {
            //System.out.println(Arrays.toString(arr.get(i)));

            for (int j = 0; j < arr.get(i).length; j++) {

                //   System.out.println(arr.get(i)[j]);

            }

        }
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(twoTimes(test));

        String ss = "12.0";
        double k = Double.parseDouble(ss);

    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> lst) {
        ArrayList<Integer> newLst = new ArrayList<>(8);
        int j = 0;
        for (int i = lst.size() - 1; i >= 0; i--) {
            newLst.add(j, lst.get(i));
            newLst.add(j + 1, lst.get(i));


        }
        return newLst;


    }

    public static double convertC(String[][] money, String[][] convertionRate) {
        double total = 0;
        for (int i = 0; i < money.length; i++) {

            for (int j = convertionRate.length - 1; j < convertionRate.length; j++) {
                total += Double.parseDouble(money[i][1]) * Double.parseDouble(convertionRate[i][1]);


            }

        }
        return total;
    }
}

