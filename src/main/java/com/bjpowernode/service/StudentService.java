package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentService {

    int insert(Student student);

    List<Student> select();

}
