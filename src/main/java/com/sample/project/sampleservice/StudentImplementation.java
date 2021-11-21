package com.sample.project.sampleservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/default")
public class StudentImplementation implements StudentInterface{

    @Autowired
    private BooksHandler booksHandler;

    @Override
    public List<Student> getStudents() {
        return booksHandler.getStudents();
    }
}
