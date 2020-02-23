package day62;

import day61.Job;

import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {
    public static void main(String[] args) {
        Job j1 = new Job("CA",120000.0,"Google");
        Job j2 = new Job("TX",140000.0,"Apple");
        Job j3 = new Job("VA",100000.0,"Walmart");
        Job j4 = new Job("WA",90000.0,"Costco");
        Job j5 = new Job("NY",80000.0,"Bofa");

        SortedSet<Job> lst = new TreeSet<>(Arrays.asList(j1,j2,j3,j4,j5));
        Iterator<Job> isSrt= lst.iterator();
        while(isSrt.hasNext()){
            System.out.println(isSrt.next());
        }
       // System.out.println(lst);


    }
}
