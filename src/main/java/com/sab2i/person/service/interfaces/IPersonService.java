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
package com.sab2i.person.service.interfaces;

import com.sab2i.person.schema.Person;
import com.sab2i.person.service.exceptions.PersonException;
import java.util.List;

public interface IPersonService {
    void addPerson(Person person) throws PersonException;
    Person getPerson(Integer id) throws PersonException;
    List<Person> getAllPersons();
    void updatePerson(Person person) throws PersonException;
    void deletePerson(Integer id) throws PersonException;
}