package by.matrosov.appl.repo;

import by.matrosov.appl.model.Person;

public interface PersonRepository {

    void save(Person person);
    void delete(Person person);
}
