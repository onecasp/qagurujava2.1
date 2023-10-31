package com.gmail.oleg12.medvedev.subobjects;

import com.gmail.oleg12.medvedev.collections.Books;
import com.gmail.oleg12.medvedev.collections.Subjects;
import java.util.List;

public class Student {

    private final String name;

    private final int age;

    private final int groupID;

    private static Books books;

    private static Subjects assignedSubjects;


    public Student(String name, int age, int groupID) {
        this.name = name;
        this.age = age;
        this.groupID = groupID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGroupID() {
        return groupID;
    }

    public void giveBook(String book) {
        this.books.addBook(book);
        System.out.println("The student " + this.name + " has a book " + book);
    }

    public void giveSubject(String subject) {
        this.assignedSubjects.addSubject(subject);
        System.out.println("The student " + this.name + " has an assigned subject " + subject);
    }

    public void removeBook(String book) {
        this.books.removeBook(book);
        System.out.println("The student " + this.name + " doesn't have book " + book + " anymore");
    }

    public void removeSubject(String subject) {
        this.assignedSubjects.removeSubject(subject);
        System.out.println(
            "The student " + this.name + " doesn't have subject " + subject + " anymore");
    }
}
