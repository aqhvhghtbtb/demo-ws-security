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

import com.sab2i.person.service.interfaces.IPersonService;
import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

public abstract class AbstractPersonEndPoint extends AbstractMarshallingPayloadEndpoint{
    
    protected IPersonService personService;
    
    public void setPersonService(IPersonService personService) {
        this.personService = personService;
    }
    
    protected abstract Object invokeInternal(Object request) throws Exception;
}
