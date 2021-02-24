package com.vastika.managementsystem.repository;

import com.vastika.managementsystem.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveStudent(Student student) {
        getSession().save(student);
    }

    @Override
    public void updateStudent(Student student) {
        getSession().update(student);
    }

    @Override
    public void deleteStudent(int id) {
        Student student = getSession().load(Student.class, id);
        if (student != null) {
            getSession().delete(student);
        }
    }

    @Override
    public Student getStudentById(int id) {
        return getSession().get(Student.class, id);
    }

    @Override
    public List<Student> getAllStudent() {
        Query query = getSession().createQuery("from Student");
        return query.getResultList();
    }

    public Session getSession() {
        Session session = sessionFactory.getCurrentSession();
        return session;
    }
}
