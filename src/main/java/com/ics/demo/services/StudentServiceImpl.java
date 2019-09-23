package com.ics.demo.services;

import com.ics.demo.NotFoundException;
import com.ics.demo.models.Student;
import com.ics.demo.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow(()
                ->new NotFoundException("No student with the id"+id));
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        //look for the object
        Student found = findById(student.getId());

        //update the object based on the passed object
        found.setFirstName(student.getFirstName());
        found.setLastName(student.getLastName());
        found.setMiddleName(student.getMiddleName());
        found.setDob(student.getDob());

        return studentRepository.save(found);
    }

    @Override
    public Student update(long id, Student student) {
        //find student
        Student found = findById(id);

        //update the object based on the passed object
        found.setFirstName(student.getFirstName());
        found.setMiddleName(student.getMiddleName());
        found.setLastName(student.getLastName());
        found.setDob(student.getDob());
        return studentRepository.save(found);
    }
}
