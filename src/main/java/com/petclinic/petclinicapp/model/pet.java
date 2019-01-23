package com.petclinic.petclinicapp.model;

import java.time.LocalDate;

import com.petclinic.petclinicapp.model.BaseEntity;
import com.petclinic.petclinicapp.model.Pettype;
import com.petclinic.petclinicapp.model.owner;

public class pet extends BaseEntity {
	private Pettype pettype;
	private owner Owner;
	private LocalDate birthDay;
	public Pettype getPettype() {
		return pettype;
	}
	public void setPettype(Pettype pettype) {
		this.pettype = pettype;
	}
	public owner getOwner() {
		return Owner;
	}
	public void setOwner(owner owner) {
		Owner = owner;
	}
	public LocalDate getBirthDay()
	{
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) 
	{
		this.birthDay = birthDay; 
	}
}
