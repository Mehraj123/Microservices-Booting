package com.student.rest;


import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
