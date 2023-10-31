package com.gmail.oleg12.medvedev.collections;

import java.util.HashSet;
import java.util.*;

public class Subjects {
    //set

    static Set<String> subjectSet = new HashSet<>();

    public static void addSubject(String subject) {
        subjectSet.add(subject);
    }

    public static void removeSubject(String subject) {
        subjectSet.remove(subject);
    }

    public static void searchSubject(String subject) {
        do {
            if(subjectSet.iterator().next().equals(subject)) {
                System.out.println("The subject " + subject + " has beed found!");
            }
            else {
                System.out.println("The subject " + subject + " not found!");
            }
        } while (subjectSet.iterator().hasNext());
    }
}
