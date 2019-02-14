package com.teacher.rest;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.teacher.feign.StudentClient;
import com.teacher.model.Student;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/teachers")
@AllArgsConstructor
public class TeacherController {

  private StudentClient studentClient;

  @GetMapping
  public ResponseEntity<List<Student>> findAllStudents() {
    return studentClient.findAll();
  }

}
