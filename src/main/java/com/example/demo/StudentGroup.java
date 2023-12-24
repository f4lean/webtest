package com.example.demo;

public class StudentGroup {
    public final int id;
    private String groupName;

    public StudentGroup(int id, String groupName) {
        this.id = id;
        this.groupName = groupName;
    }

    public int getId() {
        return this.id;
    }

    public String getGroupName() {
        return groupName;
    }
}
