package com.sunglowsys.test;
import java.util.List;

import com.sunglowsys.domain.Student;
import com.sunglowsys.service.StudentServiceImpl;

public class FindAllStudent {
    public static void main(String[] args) {
        List<Student> studentList = new StudentServiceImpl().findAllStudent();
        for(Student student : studentList){
            System.out.println(student);
        }
    }
}
