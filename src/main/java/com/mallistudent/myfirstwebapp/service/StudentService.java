package com.mallistudent.myfirstwebapp.service;

import com.mallistudent.myfirstwebapp.entity.Student;
import com.mallistudent.myfirstwebapp.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {

    @Autowired
    private StudentRepo studentRepo;
    public List<Student> getStudents() {

        return studentRepo.findAll();
    }

    public void saveStudent(Student student) {
        studentRepo.save(student);
    }

}
