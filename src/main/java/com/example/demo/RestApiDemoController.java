package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class RestApiDemoController {
    private List<Student> students = new ArrayList<>();
    private List<StudentGroup> groups = new ArrayList<>();


    public RestApiDemoController() {
        this.students.addAll(List.of(
            new Student(1, "Gosha", "Petrov", 20, 1),
            new Student(2, "Jhenya", "Ivanov", 28, 1)
        ));
        this.groups.addAll(List.of(
                new StudentGroup(1, "Ochka"),
                new StudentGroup(2, "Zaochka")
        ));
        System.out.println(this.students.get(0));
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    Iterable<StudentResponse> getStudents() {
        List<StudentResponse> studentResponses = new ArrayList<>();
        for (Student student : students) {
            studentResponses.add(new StudentResponse(student, groups));
        }
        return studentResponses;
    }

    @GetMapping("/students/{id}")
    Optional<Student> getStudentById(@PathVariable int id) {
        for (Student s: students) {
            if (s.getId() == id) {
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }

    @PostMapping("/students")
    Student postStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    @DeleteMapping("/students/{id}")
    void deleteStudent(@PathVariable int id) { students.removeIf((c -> c.getId() == id)); }

    @GetMapping("/groups")
    Iterable<StudentGroup> getStudentGroup() {
        return groups;
    }
}
