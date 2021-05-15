package com.polaris.spring.security.demo.student.api;

import com.polaris.spring.security.demo.student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    public static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Michael Jordan"),
            new Student(2, "Kobe Bryant")
    );

    @GetMapping(path = "{id}")
    public Student getStudent(@PathVariable("id") Integer id) {
        return STUDENTS.stream()
                .filter(student -> id.equals(student.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + id + " does not exist"));
    }

}
