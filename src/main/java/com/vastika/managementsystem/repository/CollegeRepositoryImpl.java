package com.vastika.managementsystem.repository;

import com.vastika.managementsystem.model.College;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class CollegeRepositoryImpl implements CollegeRepository{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveCollege(College college) {
        getSession().save(college);
    }

    @Override
    public void updateCollege(College college) {
        getSession().update(college);
    }

    @Override
    public void deleteCollege(int id) {
        College college = getSession().load(College.class, id);
        if(college != null) {
            getSession().delete(college);
        }
    }

    @Override
    public College getCollegeById(int id) {
        return getSession().get(College.class, id);
    }

    @Override
    public List<College> getAllCollege() {
        Query query = getSession().createQuery("from College");
        return query.getResultList();
    }

    public Session getSession() {
        Session session = sessionFactory.getCurrentSession();
        return session;
    }
}
