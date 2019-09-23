package com.ics.demo.controller;

import com.ics.demo.models.Student;
import com.ics.demo.models.University;
import com.ics.demo.services.StudentService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    //get
    @GetMapping
    public List<Student>findAll(){
        return studentService.findAll();
    }

    //get by id
    //id is a path variable
    @GetMapping(value = "{id}")
    Student findById(@PathVariable long id){
        return studentService.findById(id);
    }

    //create
    @PostMapping
    Student createUniversity(@Validated(Student.Create.class) @RequestBody Student student){
        return studentService.createStudent(student);
    }

    //delete
    @DeleteMapping(value = "{id}")
    public void deleteUniversity(@PathVariable long id){
        studentService.delete(id);
    }

    //patch
    @PatchMapping
    public Student updateStudent(@Validated(Student.Update.class) @RequestBody Student student){
        return studentService.update(student);
    }

    @PatchMapping(value = "{id}")
    public Student updateStudent(@PathVariable long id, @RequestBody Student student){
        return studentService.update(id, student);
    }
}
