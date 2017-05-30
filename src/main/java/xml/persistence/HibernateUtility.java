package xml.persistence;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import xml.entity.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class HibernateUtility {
    private SessionFactory sessionFactory;

    public HibernateUtility(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void createObjectInDatabase(Object modelObject) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(modelObject);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void getStudentList() {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            ArrayList<Student> studentList = (ArrayList<Student>) session.createQuery("FROM Student").list();
            for (Iterator iterator = studentList.iterator(); iterator.hasNext(); ) {
                Student student = (Student) iterator.next();
                System.out.println(student.toString());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
