package day62;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {
    public static void main(String[] args) {
        SortedSet<Integer> mySet = new TreeSet<>();
        mySet.add(12);
        mySet.add(12);
        mySet.add(22);
        mySet.add(44);
        mySet.add(33);
        mySet.add(99);
        mySet.add(33);
        System.out.println(mySet);
        System.out.println(  mySet.first());
        System.out.println("mySet.last() = " + mySet.last());


    }
}
