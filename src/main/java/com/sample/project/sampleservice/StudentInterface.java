/*
copy right anant barthwal
 */
package com.sample.project.sampleservice;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface StudentInterface {


    @GetMapping("/students")
    public List<Student> getStudents();
}

