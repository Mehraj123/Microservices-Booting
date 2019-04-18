package com.student.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequest {
    private Long id;
    private String firstName;
    private String lastName;
    private String department;
    private String email;
}
