package com.example.dao;

import com.example.entity.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CourseDAO {

    public void save(EntityManagerFactory entityManagerFactory) {
        Course course1 = new Course("math", 16, 70000.00);
        Course course2 = new Course("science", 15, 2000.00);
        Course course3 = new Course("history", 13, 450.00);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(course1);
        entityManager.persist(course2);
        entityManager.persist(course3);
        transaction.commit();

        entityManager.close();


    }

   /* public void update(EntityManagerFactory entityManagerFactory) {


        Course course1 = new Course(3, "SPRINGFRAMEWORK", 16, 70000.00);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.merge(course1);
        transaction.commit();

        entityManager.close();


    }*/

    public void read(EntityManagerFactory entityManagerFactory) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Course course = entityManager.find(Course.class, 3);
        System.out.println(course.toString());


        // entityManager.merge(course1);
        transaction.commit();

        entityManager.close();


    }

    public void update(EntityManagerFactory entityManagerFactory) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Course course = entityManager.find(Course.class, 3);
        System.out.println(course.toString());
        course.setTitle("NEWTITLE");

        // entityManager.merge(course1);
        transaction.commit();

        entityManager.close();


    }

    public void delete(EntityManagerFactory entityManagerFactory) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Course course = entityManager.find(Course.class, 4  );
        System.out.println(course.toString());
        entityManager.remove(course);

        // entityManager.merge(course1);
        transaction.commit();

        entityManager.close();


    }


}
