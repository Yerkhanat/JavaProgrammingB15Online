package day61;

import java.util.*;

public class JobHunter {
    public static void main(String[] args) {
        List<Job> jobs = new LinkedList<>(Arrays.asList(
                new Job("Texas",100000.0,"Apple"),
                new Job("Los Angeles", 120000.0, "Walmart"),
                new Job ("San Francisco", 1400000.0, "Google"),
                new Job("Irvine", 90000.0,"Linkedin")));


        System.out.println( jobs.get(0).compareTo(jobs.get(1)));
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, Comparator.reverseOrder());
        System.out.println(jobs);
        Collections.sort(jobs, Collections.reverseOrder());
        System.out.println(jobs);



    }
}
