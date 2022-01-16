package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.repository.StudentRepositoryImpl;
import org.hibernate.Session;

public class UpdateStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("student");

        new StudentRepositoryImpl().updateStudent(student,1L);

    }
}
