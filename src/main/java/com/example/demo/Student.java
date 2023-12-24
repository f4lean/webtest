package com.example.demo;

public class Student {
    private final int id;
    private String name;
    private String surname;
    private int age;
    private int groupId;
    public Student(int id, String name, String surname, int age, int groupId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.groupId = groupId;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public int getGroupId() {
        return groupId;
    }
}
