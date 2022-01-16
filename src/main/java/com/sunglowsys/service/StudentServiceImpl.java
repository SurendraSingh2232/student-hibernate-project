package com.sunglowsys.service;

import com.sunglowsys.domain.Student;
import com.sunglowsys.repository.StudentRepository;
import com.sunglowsys.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository = new StudentRepositoryImpl();

    @Override
    public Student saveStudent(Student student) {

        Student student1;
        student1 = studentRepository.saveStudent(student);
        return student1;
    }

    @Override
    public Student updateStudent(Student student, Long id) {
        return studentRepository.updateStudent(student,id);
    }

    @Override
    public List<Student> findAllStudent() {
        List<Student> studentList = studentRepository.findAllStudent();
        return studentList;
    }

    @Override
    public Student findByIdStudent(Long id) {
        Student student = studentRepository.findByIdStudent(id);

        return student;
    }

    @Override
    public Student deleteStudentById(Long id) {

        return studentRepository.deleteStudentById(id);
    }
}
