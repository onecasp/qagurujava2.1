package com.gmail.oleg12.medvedev;

import com.gmail.oleg12.medvedev.collections.StudentsBook;
import com.gmail.oleg12.medvedev.collections.Subjects;
import com.gmail.oleg12.medvedev.subobjects.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        //to add a new Student
        Student oleg = new Student(
            "Oleg",
            26,
            134567
        );

        Student oksana = new Student(
            "Oksana",
            26,
            123445
        );

        //let's create a group of enrollees
        Student[] studentsArray = new Student[] {
          oleg,
          oksana
        };

        // to add them in a StudentBook
        StudentsBook.addStudent("1", oleg);
        StudentsBook.addStudent("2", oksana);

        //to add subjects in their schedule
        Subjects.addSubject("Math");
        Subjects.addSubject("Biology");
        Subjects.addSubject("History");

        //every student should have
    }
}