package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.service.StudentServiceImpl;

public class DeleteStudent {
    public static void main(String[] args) {
        Student student = new StudentServiceImpl().deleteStudentById(4L);
        System.out.println(student);

    }
}
