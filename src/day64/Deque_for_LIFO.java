package day64;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_for_LIFO {
    public static void main(String[] args) {
        Deque<String> taskDeque = new LinkedList<>();
        taskDeque.add("Review the class");
        taskDeque.add("Do your homework");
        taskDeque.add("attend the class");
        taskDeque.add("Say bye to Java");

        //System.out.println("taskDeque.remove() = " + taskDeque.remove());
        System.out.println(taskDeque.removeLast());
        System.out.println(taskDeque.removeLast());
        System.out.println(taskDeque.removeLast());
        System.out.println(taskDeque.removeLast());


    }
}
