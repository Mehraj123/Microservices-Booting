package com.student.service;

import com.student.model.Student;
import com.student.repository.StudentRepository;
import com.student.request.StudentRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student create(StudentRequest request) {
        Student student = new Student();
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setDepartment(request.getDepartment());
        student.setEmail(request.getEmail());
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public Student update(StudentRequest request) {
        Student student = studentRepository.findById(request.getId()).orElseThrow(() -> new RuntimeException("No Student Found by the Id " + request.getId()));
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setDepartment(request.getDepartment());
        student.setEmail(request.getEmail());
        return studentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}
