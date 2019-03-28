package by.matrosov.appl.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;


public class CustomHibernateDaoSupport extends HibernateDaoSupport {

    @Autowired
    public void anyMethodName(SessionFactory sessionFactory){
        //HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
        //hibernateTemplate.setCheckWriteOperations(false);
        setSessionFactory(sessionFactory);
    }
}
