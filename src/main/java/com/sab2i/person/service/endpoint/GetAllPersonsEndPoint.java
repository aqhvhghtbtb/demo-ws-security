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
package com.sab2i.person.service.endpoint;

import com.sab2i.person.schema.GetAllPersonsResponse;
import com.sab2i.person.schema.Person;

public class GetAllPersonsEndPoint extends AbstractPersonEndPoint{

    @Override
    protected Object invokeInternal(Object request) throws Exception {
        GetAllPersonsResponse getAllResponse = new GetAllPersonsResponse();
        for(Person person: personService.getAllPersons()) {
            getAllResponse.getPerson().add(person);
        }
        return getAllResponse;
    }
}
