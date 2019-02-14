package com.student.service;

import com.student.model.Student;
import com.student.repository.StudentRepository;
import com.student.request.StudentRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class StudentService {

    private StudentRepository studentRepository;

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public Student createStudent(StudentRequest request) {
        Student student = new Student();
        student.setName(request.getName());
        Student savedStudent = studentRepository.save(student);
        return savedStudent;
    }
}
