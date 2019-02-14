package com.student.rest;


import java.util.List;

import com.student.request.StudentRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.student.model.Student;
import com.student.service.StudentService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {

  private StudentService studentService;

  @GetMapping
  public ResponseEntity<List<Student>> findAll() {
    return new ResponseEntity<>(studentService.findAllStudents(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<Student> create(@RequestBody StudentRequest request){
    Student savedStudent = studentService.createStudent(request);
    return new ResponseEntity<>(savedStudent,HttpStatus.CREATED);
  }

}
