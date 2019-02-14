package com.student.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer rollNo;
  private String name;

}
