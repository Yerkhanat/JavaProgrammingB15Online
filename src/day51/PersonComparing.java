package day51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonComparing {
    public static void main(String[] args) {
        Person p1 = new Person("Yerkhanat", 28);
        Person p2 = new Person("Janar", 25);
        Person p3 = new Person ("Alakosh", 2);

            if(p1.age >p2.age){
                System.out.println(1);
            }else if(p1.age == p2.age) {
                System.out.println(0);
            }else{
                System.out.println(-1);
            }

        System.out.println( p1.compareTo(p2));
        System.out.println(p3.compareTo(p1));
        System.out.println(p2.compareTo(new Person("Bota",34)));
        System.out.println(p1.getOlderName(p2));

        List<Person> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(new Person("John Snow", 35));
        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);


    }
}
