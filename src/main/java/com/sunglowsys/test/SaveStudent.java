package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.service.StudentService;
import com.sunglowsys.service.StudentServiceImpl;

public class SaveStudent {
    public static void main(String[] args) {
        Student result = new Student("Hirdesh","kumar","hk@gmail.com","9675393939","B.sc");

        StudentService studentService = new StudentServiceImpl();
        Student student1;
        student1 = studentService.saveStudent(result);
        System.out.println(student1);
        System.out.println("created");
    }
}
