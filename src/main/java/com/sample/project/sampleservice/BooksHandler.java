package com.sample.project.sampleservice;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class BooksHandler {

    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        Student student = new Student();
        student.setName("aman");
        student.setAge(10);
        studentList.add(student);
        Student student1 = new Student();
        student1.setName("aman");
        student1.setAge(10);
        studentList.add(student1);

        return studentList;
    }
}
