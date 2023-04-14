package com.in28minutes.springboot.learnspringboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class CourseController {

    @RequestMapping("courses")
    public ResponseEntity<?> retrieveAllCourses() {
        var result = Arrays.asList(
                new Course(1, "Learn AWS", "in28minutes"),
                new Course(2, "Learn DevOps", "in28minutes")
        );

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
