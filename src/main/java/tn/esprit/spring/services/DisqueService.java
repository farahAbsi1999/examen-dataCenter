package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entities.Disque;
import tn.esprit.spring.repositories.IDisqueRepository;



public class DisqueService implements IDisqueService {

	@Autowired
	IDisqueRepository disqueRepository;
	
	@Override
	public void ajouterDisque(Disque disque) {
		disqueRepository.save(disque);
	}
	
	@Override
	public void deleteDisque(Integer id) {
		disqueRepository.delete(disqueRepository.findById(id).get());
		
	}

}
