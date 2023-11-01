package com.gmail.oleg12.medvedev.collections;

import com.gmail.oleg12.medvedev.subobjects.Student;
import java.util.LinkedList;
import java.util.Queue;

public class ExamQueue {

    // queue
    //создать очередь для конкретного предмета (поиск по предмету + добавление в очередь)
    //создать удаление из очереди по имени и группе


    Queue<Student> newQueue = new LinkedList<>();

    public ExamQueue(Student[] students) {

        for (Student selectedStudent : students) {
            newQueue.add(selectedStudent);
            System.out.println(
                "The student " + selectedStudent.getName() + " is added to the queue!");
        }
    }

    public void removeStudentFromQueue(Student student) {
        newQueue.remove(student);
        System.out.println(
            "The student " + student.getName() + " is removed from the queue!");
    }

    public void addStudentFromQueue(Student student) {
        newQueue.add(student);
        System.out.println(
            "The student " + student.getName() + " is added to the queue!");
    }

    public void showTheCurrentQueue() {
        int i = 0;
        for (Student student : newQueue) {
            System.out.println(
                "The student " + student.getName() + " is in queue now under the number " + i
                    + " !");
            i++;
        }
    }

    public void searchInQueue(String name) {
        for (int i=0; i < newQueue.size(); i++) {
            if (newQueue.iterator().next().getName().equals(name)) {
                System.out.println(
                    "The student " + name + " is in queue now!");
            } else if (i == newQueue.size()-1) {
                System.out.println(
                    "The student " + name + " not found in queue :(");
            }
        }
    }
}
