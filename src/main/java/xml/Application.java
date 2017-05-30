package xml;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import xml.entity.Parent;
import xml.entity.Student;
import xml.entity.Teacher;
import xml.persistence.HibernateUtility;

import java.util.Date;

/**
 * Created by linh6_000 on 05/30/2017.
 */
public class Application {
    private static Configuration config;
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    private static HibernateUtility hibernateUtility;


    public static void main(String[] args) {
        initComponents();
//        insertObjects();
        hibernateUtility.getStudentList();
    }

    private static void initComponents() {
        config = new Configuration();
        config.configure();
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        sessionFactory = config.buildSessionFactory(serviceRegistry);
        hibernateUtility = new HibernateUtility(sessionFactory);

    }

    private static void insertObjects() {
        Date date = new Date();
        Parent parent0 = new Parent("par@gmail.com", "Tung", "Nguyen", date, "4535235", "23423523", true, date, "192.168.1.1");
        Parent parent1 = new Parent("p2ar@gmail.com", "Abc", "Nguyen", date, "34", "222", true, date, "192.168.1.1");
        Parent parent2 = new Parent("p14ar@gmail.com", "DEf", "Nguyen", date, "124", "2341", false, date, "192.168.1.1");
        Parent parent3 = new Parent("p15ar@gmail.com", "Omega", "Nguyen", date, "9653", "111", false, date, "192.168.1.1");
        Parent parent4 = new Parent("pa1r@gmail.com", "xyz", "Nguyen", date, "2424", "66666", true, date, "192.168.1.1");
        Parent parent5 = new Parent("pa1r@gmail.com", "xyz", "Nguyen", date, "2424", "66666", true, date, "192.168.1.1");
        hibernateUtility.createObjectInDatabase(parent0);
        hibernateUtility.createObjectInDatabase(parent1);
        hibernateUtility.createObjectInDatabase(parent2);
        hibernateUtility.createObjectInDatabase(parent3);
        hibernateUtility.createObjectInDatabase(parent4);
        hibernateUtility.createObjectInDatabase(parent5);


        Student student0 = new Student("lsh@gmail.com", "lsh123", "Hai", "Luong", date, "12321", "324234", parent0, date, true, date, "184.24.245.12", 2);
        Student student1 = new Student("232@gmail.com", "34", "Vinh", "Nguyen", date, "232s", "sdf", parent1, date, true, date, "184.24.245.12", 2);
        Student student2 = new Student("sdsd@gmail.com", "sdf", "Van", "Dang", date, "343f", "234", parent2, date, true, date, "184.24.245.12", 2);
        Student student3 = new Student("34d@gmail.com", "234", "Hoa", "Tran", date, "32421", "sdfsdf", parent3, date, true, date, "184.24.245.12", 2);
        Student student4 = new Student("234dsf@gmail.com", "sdf", "Linh", "Nguyen", date, "sdfsdf", "3434", parent4, date, true, date, "184.24.245.12", 2);
        Student student5 = new Student("234dsf@gmail.com", "sdf", "Tai", "Nguyen", date, "sdfsdf", "3434", parent5, date, true, date, "184.24.245.12", 2);
        hibernateUtility.createObjectInDatabase(student0);
        hibernateUtility.createObjectInDatabase(student1);
        hibernateUtility.createObjectInDatabase(student2);
        hibernateUtility.createObjectInDatabase(student3);
        hibernateUtility.createObjectInDatabase(student4);
        hibernateUtility.createObjectInDatabase(student5);

        Teacher teacher0 = new Teacher("abc@gmail.com", "abc123", "Linh", "Nguyen", date, "90932049", "1234", true, date, "192.64.10.10");
        Teacher teacher1 = new Teacher("as2@gmail.com", "abc123", "Duc", "Tran", date, "5435", "23435", false, date, "192.64.50.10");
        Teacher teacher2 = new Teacher("b53@gmail.com", "abc123", "Minh", "Nguyen", date, "23432", "23124", true, date, "192.24.10.10");
        Teacher teacher3 = new Teacher("123f@gmail.com", "abc123", "Hai", "Luong", date, "6453", "3243", false, date, "192.64.10.63");
        Teacher teacher4 = new Teacher("6234@gmail.com", "abc123", "Long", "Nguyen", date, "234234", "2342", true, date, "192.64.96.72");
        Teacher teacher5 = new Teacher("6234@gmail.com", "abc123", "Long", "Nguyen", date, "234234", "2342", true, date, "192.64.96.72");
        hibernateUtility.createObjectInDatabase(teacher0);
        hibernateUtility.createObjectInDatabase(teacher1);
        hibernateUtility.createObjectInDatabase(teacher2);
        hibernateUtility.createObjectInDatabase(teacher3);
        hibernateUtility.createObjectInDatabase(teacher4);
        hibernateUtility.createObjectInDatabase(teacher5);
    }
}
