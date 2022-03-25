package tn.esprit.spring.services;
import org.springframework.beans.factory.annotation.Autowired;


import tn.esprit.spring.entities.Disque;

import tn.esprit.spring.entities.DataCenter;

import tn.esprit.spring.repositories.IDataCenterRepository;

import tn.esprit.spring.repositories.IDisqueRepository;

public class DisqueService implements IDisqueService {

	@Autowired
	IDisqueRepository disqueRepository;

	IDataCenterRepository datacenterRepository  ;

	
	@Override
	public void ajouterDisque(Disque disque) {
		disqueRepository.save(disque);
	}
	
	@Override
	public void deleteDisque(Integer id) {
		disqueRepository.delete(disqueRepository.findById(id).get());
		
	}


	@Override
	public void affecterDisqueDatacenter(int idD, int idDc) {
		Disque ds = disqueRepository.findById(idD).orElse(null);
		DataCenter dc = datacenterRepository.findById(idDc).orElse(null);
		dc.getDisques().add(ds);
		datacenterRepository.save(dc);
	}


}
