/**
 *		                     /$$        /$$$$$$  /$$
 *		  /$$$$$$$  /$$$$$$ | $$$$$$$ |__/  \ $$ /$$
 *		 /$$_____/ |____  $$| $$__  $$  /$$$$$$/| $$
 *		|  $$$$$$   /$$$$$$$| $$  \ $$ /$$____/ | $$
 *		 \____  $$ /$$__  $$| $$  | $$| $$      | $$
 *		 /$$$$$$$/|  $$$$$$$| $$$$$$$/| $$$$$$$$| $$
 *		|_______/  \_______/|_______/ |________/|__/                         
 *                          ~ Departement - SSI
 *                           ~ @author martinsa 
 * 
 */
package com.sab2i.person.service.impl;

import com.sab2i.person.schema.Person;
import com.sab2i.person.service.exceptions.PersonException;
import com.sab2i.person.service.interfaces.IPersonService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonServiceImpl implements IPersonService {

    private Map dataSource;

    @Override
    public void addPerson(Person person) throws PersonException {
        if (idExists(person.getId())) {
            throw new PersonException("Cannot add person. Id already exists.");
        }
        dataSource.put(person.getId(), person);
    }

    @Override
    public void deletePerson(Integer id) throws PersonException {
        if (!idExists(id)) {
            throw new PersonException("Cannot delete person. Id does not exists.");
        }
        dataSource.remove(id);
    }

    @Override
    public List<Person> getAllPersons() {
        return new ArrayList(dataSource.values());
    }

    @Override
    public Person getPerson(Integer id) throws PersonException {
        if (!idExists(id)) {
            throw new PersonException("Cannot get person. ID does not exist.");
        }
        return (Person) dataSource.get(id);
    }

    @Override
    public void updatePerson(Person person) throws PersonException {
        if (!idExists(person.getId())) {
            throw new PersonException("Cannot update person. ID does not exist.");
        }
        dataSource.put(person.getId(), person);
    }

    public void initialize() {
        dataSource = new HashMap();
        putPerson(1, "Clark", "Kent");
        putPerson(2, "Bruce", "Wayne");
        putPerson(3, "Harold", "Jordan");
    }

    private void putPerson(Integer id, String firstName, String lastName) {
        Person person = new Person();
        person.setId(id);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        dataSource.put(id, person);
    }

    private boolean idExists(Integer id) {
        return dataSource.containsKey(id);
    }

}
