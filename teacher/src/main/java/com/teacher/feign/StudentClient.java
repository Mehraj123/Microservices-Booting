package com.teacher.feign;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.teacher.model.Student;

@FeignClient(url = "localhost:1001", value = "student")
public interface StudentClient {

  @GetMapping("/students")
  public ResponseEntity<List<Student>> findAll();
}
