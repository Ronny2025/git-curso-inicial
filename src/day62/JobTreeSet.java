package day62;

import day61.Job;
import java.util.*;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.SortedSet;
//import java.util.TreeSet;

public class JobTreeSet {

    public static void main(String[] args) {

        //Create a Sorted of Job(from day 61) treeSet implementation
        //add 5 jobs and print them out vertically and see what you get

        SortedSet<Job> sortJob = new TreeSet<>();
       sortJob.add(new Job("GA", 150000, "BOFA"));
        sortJob.add(new Job("VA", 140000, "Amazon"));
        sortJob.add(new Job("NY", 140000, "FaceBook"));
        sortJob.add(new Job("CA", 150000, "Apple"));
        sortJob.add(new Job("WA", 145000, "Microsoft"));

        for(Job each : sortJob){
            System.out.println("each = " + each);


        }
    }
}
