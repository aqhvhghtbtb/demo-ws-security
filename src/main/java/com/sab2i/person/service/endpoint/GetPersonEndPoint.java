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

import com.sab2i.person.schema.GetPersonRequest;
import com.sab2i.person.schema.GetPersonResponse;

public class GetPersonEndPoint extends AbstractPersonEndPoint{

    @Override
    protected Object invokeInternal(Object request) throws Exception {
        GetPersonRequest getPersonRequest = (GetPersonRequest) request;
        GetPersonResponse getPersonResponse = new GetPersonResponse();
        getPersonResponse.setPerson(personService.getPerson(getPersonRequest.getId()));
        return getPersonResponse;
    }
}
