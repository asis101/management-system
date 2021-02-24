package com.vastika.managementsystem.repository;

import com.vastika.managementsystem.model.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class CourseRepositoryImpl implements CourseRepository{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveCourse(Course course) {
        getSession().save(course);
    }

    @Override
    public void updateCourse(Course course) {
        getSession().update(course);
    }

    @Override
    public void deleteCourse(int id) {
        Course course = getSession().load(Course.class, id);
        if(course != null) {
            getSession().delete(course);
        }
    }

    @Override
    public Course getCourseById(int id) {
        return getSession().get(Course.class, id);
    }

    @Override
    public List<Course> getAllCourse() {
        Query query = getSession().createQuery("from Course");
        return query.getResultList();
    }

    public Session getSession() {
        Session session = sessionFactory.getCurrentSession();
        return session;
    }
}
