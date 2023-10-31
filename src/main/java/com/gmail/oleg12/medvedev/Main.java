package com.gmail.oleg12.medvedev;

import com.gmail.oleg12.medvedev.collections.StudentsBook;
import com.gmail.oleg12.medvedev.collections.Subjects;
import com.gmail.oleg12.medvedev.subobjects.Student;
import java.util.ArrayList;
import java.util.List;

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

        List<String> listOfBooks = List.of("Newton", "Lermontov", "Tolstoy");
        List<String> listOfSubjects = List.of("Math", "Biology", "History");

        //let's create a group of enrollees
        Student[] studentsArray = new Student[] {
          oleg,
          oksana
        };

        // to add them in a StudentBook
        for(int i=1; i< studentsArray.length+1; i++) {

            //let's include a new stundent into the students book
            StudentsBook.addStudent(Integer.toString(i), studentsArray[i-1]);

            for (int j=0; j < listOfBooks.size(); j++) {

               //every student should have a list of books
               studentsArray[i-1].giveBook(listOfBooks.get(j));

               //and let's add subjects in their schedule
               studentsArray[i-1].giveSubject(listOfSubjects.get(j));
            }
        }


    }
}