package com.petclinic.petclinicapp.Service.map;

import java.util.Set;

import com.petclinic.petclinicapp.Service.CrudService;
import com.petclinic.petclinicapp.Service.map.AbstractServiceMap;
import com.petclinic.petclinicapp.model.pet;

public class petServiceMap extends AbstractServiceMap<pet, Long>implements CrudService<pet, Long>{
	@Override
	public Set<pet> findAll()
	{ return super.findAll();

	}
	@Override
	public pet findById(Long id)
	{return super.findById(id);
	}
	@Override
	public pet save(pet object)
	{return super.save(object.getId(),object);
	}
	@Override
	public void delete(pet object) {
		super.delete(object);
		
	}
	public void deleteById(Long id)
	{
		
	}
	}



