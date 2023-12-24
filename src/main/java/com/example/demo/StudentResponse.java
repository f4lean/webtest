package com.example.demo;

import java.util.List;

public class StudentResponse {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String groupName;

    public StudentResponse(Student student, List<StudentGroup> groups) {
        this.id = student.getId();
        this.name = student.getName();
        this.surname = student.getSurname();
        this.age = student.getAge();
        this.groupName = findGroupNameById(student.getGroupId(), groups);
    }

    public int getId() {
        return id;
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

    public String getGroupName() {
        return groupName;
    }

    private String findGroupNameById(int groupId, List<StudentGroup> groups) {
        for (StudentGroup group : groups) {
            if (group.getId() == groupId) {
                return group.getGroupName();
            }
        }
        return null;
    }
}
