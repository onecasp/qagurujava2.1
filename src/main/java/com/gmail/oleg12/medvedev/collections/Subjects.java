package com.gmail.oleg12.medvedev.collections;

import java.util.HashSet;
import java.util.*;

public class Subjects {
    //set

    static Set<String> subjectSet = new HashSet<>();

    public static void addSubject(String subject) {
        subjectSet.add(subject);
    }

    public static void remove2Subject(List list) {
        int i=0;
        do {
            subjectSet.remove(list.get(i));
            i++;
        } while (!subjectSet.isEmpty());
    }

    public static void search2Subject(String subject) {
        if (subjectSet.contains(subject)) {
            System.out.println("The subject " + subject + " has beed found!");
        } else {
            System.out.println("The subject " + subject + " not found!");
        }
    }
}
