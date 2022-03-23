package tn.esprit.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.VirtualMachine;


@Repository
public interface IVMRepository extends CrudRepository<VirtualMachine, Integer>{
	
	
}
