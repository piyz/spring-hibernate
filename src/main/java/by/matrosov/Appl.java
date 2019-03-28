package by.matrosov;

import by.matrosov.appl.model.Person;
import by.matrosov.appl.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appl {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

        PersonService personService = (PersonService) context.getBean("PersonService");

        Person person = new Person();
        person.setPersonName("Name1");
        personService.save(person);
    }
}
