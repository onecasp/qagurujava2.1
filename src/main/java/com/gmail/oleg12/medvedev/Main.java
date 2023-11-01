package com.gmail.oleg12.medvedev;

import com.gmail.oleg12.medvedev.collections.ExamQueue;
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
        Student oleg = new Student("Oleg", 26, 134567);

        Student oksana = new Student("Oksana", 26, 134567);

        Student greg = new Student("Gregory", 16, 234567);

        //preparing lists of books and subjects
        List<String> listOfBooks = List.of("Newton", "Lermontov", "Tolstoy");
        List<String> listOfSubjects = List.of("Math", "Biology", "History");

        //let's create a group of enrollees
        Student[] studentsArray = new Student[]{oleg, oksana};

        // to add them in a StudentBook
        System.out.println(
            "Let's include a new student into the students book, give"
                + " them books and assigned subjects");
        for (int i = 1; i < studentsArray.length + 1; i++) {

            //let's include a new student into the students book
            StudentsBook.addStudent(Integer.toString(i), studentsArray[i - 1]);

            for (int j = 0; j < listOfBooks.size(); j++) {

                //every student should have a list of books
                studentsArray[i - 1].giveBook(listOfBooks.get(j));

                //and let's add subjects in their schedule
                studentsArray[i - 1].giveSubject(listOfSubjects.get(j));
            }
        }

        System.out.println("");
        System.out.println(
            "It is time for Math exam. Let's check if students have Math subject firstly");

        //oleg.checkSubject("Math"); - need to be fixed

        System.out.println("");
        System.out.println(
            "Newton book can help with exam. Let's check if students have it");

        for (Student student : studentsArray) {
            System.out.println(student.getName() + ":");
            student.checkBook("Newton");
        }

        System.out.println("");
        System.out.println("It is time for exam! Students are coming");
        //to add students to ExamQueue
        ExamQueue newQueue = new ExamQueue(studentsArray);

        System.out.println("");
        System.out.println("Current queue looks like:");
        //show the current queue
        newQueue.showTheCurrentQueue();

        System.out.println("");
        System.out.println("Looks like Oleg forgot to switch his kettle off before leaving home:");
        //to remove exact student from the queue
        newQueue.removeStudentFromQueue(oleg);

        System.out.println("");
        System.out.println("And now the queue looks like:");
        //show the current queue
        newQueue.showTheCurrentQueue();

        System.out.println("");
        System.out.println("Let's check if Oksanan is still in queue:");
        newQueue.searchInQueue("Oksana");

        System.out.println("");
        System.out.println("One more student from another group is arriving:");
        newQueue.addStudentFromQueue(greg);
        System.out.println("");
        System.out.println("And now the queue looks like:");
        //show the current queue
        newQueue.showTheCurrentQueue();

        System.out.println("");
        System.out.println(
            "The exam is over. It is time to give books back and unassigne subjects for all");
        for (int i = 1; i < studentsArray.length + 1; i++) {

            for (int j = 0; j < listOfBooks.size(); j++) {

                //books
                studentsArray[i - 1].removeBook(listOfBooks.get(j));

                //subjects
                studentsArray[i - 1].removeSubject(listOfSubjects.get(j));
            }

            //and delete them from the journal
            StudentsBook.removeStudent(Integer.toString(i));
        }

        System.out.println("");
        System.out.println(
            "The end! thanks");
    }
}