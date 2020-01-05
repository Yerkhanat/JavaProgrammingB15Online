package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {
    public static void main(String[] args) {
        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Wonder Woman");
        superHeros.add("Cyborg");
        superHeros.add("Aquaman");
        superHeros.add("Flash");

        for (int i = 0; i <superHeros.size() ; i++) {

            if(superHeros.get(i).contains("man")){

                superHeros.remove(superHeros.get(i));
                i--;

            }
        }
        System.out.println(superHeros);

        List<String>superHeroCopy = new ArrayList<>(superHeros);
        System.out.println(superHeroCopy);
    // this will create an UnModiifable list!!!
        List<String> topics = Arrays.asList("Java", "Selenium", "Database", "API");
        System.out.println("topics = " + topics);

        List<String> topicsCopy = new ArrayList<>(topics);
        topicsCopy.remove("Java");
        System.out.println(topicsCopy);

    }
}
