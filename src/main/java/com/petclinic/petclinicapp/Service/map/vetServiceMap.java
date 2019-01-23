package com.petclinic.petclinicapp.Service.map;

import java.util.Set;

import com.petclinic.petclinicapp.Service.CrudService;
import com.petclinic.petclinicapp.Service.map.AbstractServiceMap;
import com.petclinic.petclinicapp.model.vet;

public class vetServiceMap extends AbstractServiceMap<vet, Long>implements CrudService<vet, Long>{
	@Override
	public Set<vet> findAll()
	{ return super.findAll();
	}
	@Override
	public vet findById(Long id)
	{return super.findById(id);
	}
	public vet save(vet object)
	{return super.save(object.getId(), object);
	}
	@Override
	public void delete(vet object) {
		super.delete(object);
	}
	
	public void deleteById(Long id)
	{
		
	}

}
