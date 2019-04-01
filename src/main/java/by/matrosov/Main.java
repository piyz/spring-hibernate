package by.matrosov;

import by.matrosov.appl.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-data.xml");

        HibernatePersonDao hibernatePersonDao = (HibernatePersonDao) ctx.getBean("HibernateSpitterDao");

        hibernatePersonDao.addPerson(new Person("new"));
        //hibernateSpitterDao.addPerson(new Spitter("Bob", "1111", "Bob B"));

        System.out.println(hibernatePersonDao.getPersonById(1));
        System.out.println(hibernatePersonDao.getPersonById(2));
        System.out.println(hibernatePersonDao.getPersonById(3));
    }
}
