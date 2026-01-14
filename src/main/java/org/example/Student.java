package org.example;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private int age;
    private List<String> subjects;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
