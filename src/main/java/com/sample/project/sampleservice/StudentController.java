package com.sample.project.sampleservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@RequestMapping("/")*/
public class StudentController {

/*    @GetMapping("getStudents")*/
    public String getStudents() {
        return "welcome welcome bois";
    }
}
