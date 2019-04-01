package by.matrosov;

import by.matrosov.appl.Person;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class HibernatePersonDao {

    private SessionFactory sessionFactory;

    public HibernatePersonDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // Извлекает текущий сеанс из фабрики SessionFactory
    private Session currentSession() {
        try {
            return sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            return sessionFactory.openSession();
        }
    }

    public void addPerson(Person person) {
        // Использует текущий сеанс
        currentSession().save(person);
    }

    //@Override
    public Person getPersonById(long id) {
        // Использует текущий сеанс
        return (Person) currentSession().get(Person.class, id);
    }

    public void savePerson(Person person) {
        // Использует текущий сеанс
        currentSession().update(person);
    }
}
