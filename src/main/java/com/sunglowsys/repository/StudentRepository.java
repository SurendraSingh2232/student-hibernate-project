package com.sunglowsys.repository;
import com.sunglowsys.domain.Student;
import java.util.List;

public interface StudentRepository {

    Student saveStudent(Student student);

    Student updateStudent(Student student,Long id);

    List<Student> findAllStudent();

    Student findByIdStudent(Long id);

    Student deleteStudentById(Long id);


}
