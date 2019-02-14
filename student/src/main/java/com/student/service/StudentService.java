package com.student.service;

import com.student.model.Student;
import com.student.util.Util;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class StudentService {

    public List<Student> findAllStudents(){
        return Util.provideStudents();
    }
}
