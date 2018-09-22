package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * @author zxx
 * @date 2018/9/22 15:26
 */
public class StudentEntityTest {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init(){
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        transaction = (Transaction)session.beginTransaction();

    }

    @Test
    public void test(){
        StudentEntity studentEntity = new StudentEntity();
       // studentEntity.setStuno("4");
        studentEntity.setStunam("zxdsadc");
        studentEntity.setGrade(10);
        studentEntity.setSex("w");
        studentEntity.setCource("math");
        session.save(studentEntity);
    }

    @After
    public void destroy(){
        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
