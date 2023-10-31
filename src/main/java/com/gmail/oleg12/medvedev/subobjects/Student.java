package com.gmail.oleg12.medvedev.subobjects;

public class Student {

    private final String name;

    private final int age;

    private final int groupID;

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


}
