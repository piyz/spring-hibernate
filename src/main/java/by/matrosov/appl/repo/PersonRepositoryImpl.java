package by.matrosov.appl.repo;

import by.matrosov.appl.model.Person;
import by.matrosov.appl.util.CustomHibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
//@Transactional
public class PersonRepositoryImpl extends CustomHibernateDaoSupport implements PersonRepository {

    public void save(Person person) {
        getHibernateTemplate().save(person);
    }

    public void delete(Person person) {
        getHibernateTemplate().delete(person);
    }
}
