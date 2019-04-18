package com.student.service;

import com.student.model.Student;
import com.student.request.StudentRequest;

import java.util.List;

public interface StudentService {

    Student create(StudentRequest request);

    List<Student> findAll();

    Student findById(Long id);

    Student update(StudentRequest request);

    void delete(Long id);
}
