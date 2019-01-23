package com.petclinic.petclinicapp.Service.map;

import java.util.Set;

import com.petclinic.petclinicapp.Service.CrudService;
import com.petclinic.petclinicapp.Service.map.AbstractServiceMap;
import com.petclinic.petclinicapp.model.owner;

public class ownerServiceMap extends AbstractServiceMap<owner, Long>implements CrudService<owner, Long>{
@Override
public Set<owner> findAll()
{ return super.findAll();

}
@Override
public owner findById(Long id)
{return super.findById(id);
}
@Override
public owner save(owner object)
{return super.save(object.getId(),object);
}
@Override
public void delete(owner object) {
	super.delete(object);
	
}
public void deleteById(Long id)
{
	
}
}



