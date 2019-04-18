package com.student.rest;


import com.student.model.Student;
import com.student.request.StudentRequest;
import com.student.service.StudentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {

    private StudentServiceImpl studentService;

    @GetMapping("/{id}")
    public ResponseEntity<Student> findById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(studentService.findById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAll() {
        return new ResponseEntity<>(studentService.findAllStudents(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody StudentRequest request) {
        Student savedStudent = studentService.create(request);
        return new ResponseEntity<>(savedStudent, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Student> update(@RequestBody StudentRequest request) {
        return new ResponseEntity<>(studentService.update(request), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        studentService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
