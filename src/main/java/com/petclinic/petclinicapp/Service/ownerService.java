package com.petclinic.petclinicapp.Service;

import com.petclinic.petclinicapp.Service.CrudService;
import com.petclinic.petclinicapp.model.owner;

public interface ownerService extends CrudService<owner, Long> {
	owner findByLastName(String LastName);

}
