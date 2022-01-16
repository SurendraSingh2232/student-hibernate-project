package com.sunglowsys.service;

import com.sunglowsys.domain.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);

    Student updateStudent(Student student,Long id);

    List<Student> findAllStudent();

    Student findByIdStudent(Long id);

    Student deleteStudentById(Long id);
}
