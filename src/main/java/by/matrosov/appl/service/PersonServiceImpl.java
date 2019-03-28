package by.matrosov.appl.service;

import by.matrosov.appl.model.Person;
import by.matrosov.appl.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("PersonService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void save(Person person) {
        personRepository.save(person);
    }

    public void delete(Person person) {
        personRepository.delete(person);
    }
}
