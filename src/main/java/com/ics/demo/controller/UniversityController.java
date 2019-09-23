package com.ics.demo.controller;

import com.ics.demo.models.Student;
import com.ics.demo.models.University;
import com.ics.demo.repositories.StudentRepository;
import com.ics.demo.services.UniversityService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "universities")
public class UniversityController {
    private final UniversityService universityService;
    private final StudentRepository studentRepository;

    public UniversityController(UniversityService universityService, StudentRepository studentRepository) {
        this.universityService = universityService;
        this.studentRepository = studentRepository;
    }

    //get
    @GetMapping
    public List<University> findAll(){
        return universityService.findAll();
    }

    //id is a path variable
    @GetMapping(value = "{id}")
    University findById(@PathVariable long id){
        return universityService.findById(id);
    }

    //create
    @PostMapping
    University createUniversity(
            @Validated(University.Create.class)
            @RequestBody University university){
        return universityService.createUniversity(university);
    }

    //delete
    @DeleteMapping(value = "{id}")
    public void deleteUniversity(@PathVariable long id){
        universityService.delete(id);
    }

    //patch
    @PatchMapping
    public University updateUniversity(
            @Validated(University.Update.class)
            @RequestBody University university){
        return universityService.update(university);
    }

    @PatchMapping(value = "{id}")
    public University updateUniversity(@PathVariable long id, @RequestBody University university){
        return universityService.update(id, university);
    }

    @PostMapping(value = "{id}/students")
    public Student createStudent(@PathVariable long id, @RequestBody Student student){
        return  universityService.createStudent(id, student);
    }

}
