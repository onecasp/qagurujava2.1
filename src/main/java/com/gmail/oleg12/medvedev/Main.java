package com.gmail.oleg12.medvedev;

import com.gmail.oleg12.medvedev.collections.ExamQueue;
import com.gmail.oleg12.medvedev.collections.StudentsBook;
import com.gmail.oleg12.medvedev.subobjects.Student;
import java.util.List;

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

        System.out.println(
            "\n It is time for Math exam. Let's check if students have Math subject firstly");

        for (Student student : studentsArray) {
            System.out.println(student.getName() + ":");
            student.checkSubject("Math");
        }

        System.out.println(
            "\n Newton book can help with exam. Let's check if students have it");

        for (Student student : studentsArray) {
            System.out.println(student.getName() + ":");
            student.checkBook("Newton");
        }

        System.out.println("\n It is time for exam! Students are coming");
        //to add students to ExamQueue
        ExamQueue newQueue = new ExamQueue(studentsArray);

        System.out.println("\n Current queue looks like:");
        //show the current queue
        newQueue.showTheCurrentQueue();

        System.out.println("\n Looks like Oleg forgot to switch his kettle off before leaving home:");
        //to remove exact student from the queue
        newQueue.removeStudentFromQueue(oleg);

        System.out.println("\n And now the queue looks like:");
        //show the current queue
        newQueue.showTheCurrentQueue();

        System.out.println("\n Let's check if Oksana is still in queue:");
        newQueue.searchInQueue("Oksana");

        System.out.println("\n One more student from another group is arriving:");
        newQueue.addStudentFromQueue(greg);

        System.out.println("\n But who is Greg?? Let's check if he is in our student book:");
        StudentsBook.searchByNameAndGroup("Gregory", 234567);

        System.out.println("\n And now the queue looks like:");
        //show the current queue
        newQueue.showTheCurrentQueue();

        System.out.println(
            "\n The exam is over. It is time to give books back and unassigne subjects for all");
        for (int i = 1; i < studentsArray.length + 1; i++) {

            for (int j = 0; j < listOfBooks.size(); j++) {

                //books
                studentsArray[i - 1].removeBook(listOfBooks.get(j));

            }

            //subjects
            studentsArray[i - 1].removeSubject(listOfSubjects);

            //and delete them from the journal
            StudentsBook.removeStudent(Integer.toString(i));
        }

        System.out.println(
            "\n The end! thanks");
    }
}