package com.ics.demo.services;

import com.ics.demo.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    Student findById(Long id);

    void delete(Long id);

    Student createStudent(Student student);

    Student update(Student student);

    Student update(long id, Student student);

}
