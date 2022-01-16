package com.sunglowsys.repository;

//import com.mysql.cj.protocol.ServerSessionStateController;
import com.sunglowsys.domain.Student;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{
    private final static  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Student saveStudent(Student student) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Long id = (Long) session.save(student);
        session.getTransaction().commit();
        Student std = session.get(Student.class,id);
        return std;

    }

    @Override
    public Student updateStudent(Student student, Long id) {
        Session session  = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student result = session.get(Student.class,id);
        result.setFirstName(student.getFirstName());
        session.getTransaction().commit();
        session.update(result);
        System.out.println(result);
        System.out.println("updated");
        return null;
    }

    @Override
    public List<Student> findAllStudent() {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Student");
        List<Student> studentList = query.list();
        session.getTransaction().commit();

        return studentList;
    }

    @Override
    public Student findByIdStudent(Long id) {
        Session session = sessionFactory.openSession();
        Student student = session.get(Student.class,id);
        return student;
     }

    @Override
    public Student deleteStudentById(Long id) {
        Session session = sessionFactory.openSession();
        Student student = session.get(Student.class,id);
        Transaction transaction = session.beginTransaction();
        session.delete(student);
        session.getTransaction().commit();
        System.out.println(student);
        System.out.println("deleted");
        return student;

    }

}
