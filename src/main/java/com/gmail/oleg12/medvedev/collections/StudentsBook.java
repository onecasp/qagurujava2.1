package com.gmail.oleg12.medvedev.collections;

import com.gmail.oleg12.medvedev.subobjects.Student;
import java.util.HashMap;
import java.util.Map;

public class StudentsBook {

    //map

    static Map<String, Student> studentsjournal = new HashMap<>();

    public static void addStudent(String id, Student student) {
        studentsjournal.put(id, student);
        System.out.println("The student " + student.getName() + " has been added into the group "
            + student.getGroupID() + " and id = " + id);
    }

    public void removeStudent(String id) {
        studentsjournal.remove(id);
    }

    public void searchByNameAndGroup(String name, int groupID) {
        for (Map.Entry<String, Student> item : studentsjournal.entrySet()) {
            if (item.getValue().getName().equals(name) && item.getValue().getGroupID() == groupID) {
                System.out.println("The student has been found");
                break;
            }
        }
    }
}
