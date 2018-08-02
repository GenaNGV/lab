package com.itechart.lab.controller;

import com.itechart.lab.model.Student;
import com.itechart.lab.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class LabController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public Collection<Student> students() {
        return studentService.list();
    }

}
