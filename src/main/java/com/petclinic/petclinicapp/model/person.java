package com.petclinic.petclinicapp.model;

import com.petclinic.petclinicapp.model.BaseEntity;


public class person extends BaseEntity {
	public String FirstName;
	public String LastName;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;

}
}
