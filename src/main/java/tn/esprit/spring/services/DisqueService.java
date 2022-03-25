package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;

<<<<<<< HEAD
import tn.esprit.spring.entities.Disque;
=======
import tn.esprit.spring.entities.DataCenter;
import tn.esprit.spring.entities.Disque;
import tn.esprit.spring.repositories.IDataCenterRepository;
>>>>>>> 47d7bdae18ef243494cb7f49ff83b2581caf1e04
import tn.esprit.spring.repositories.IDisqueRepository;



public class DisqueService implements IDisqueService {

	@Autowired
	IDisqueRepository disqueRepository;
<<<<<<< HEAD
=======
	IDataCenterRepository datacenterRepository  ;
>>>>>>> 47d7bdae18ef243494cb7f49ff83b2581caf1e04
	
	@Override
	public void ajouterDisque(Disque disque) {
		disqueRepository.save(disque);
	}
	
	@Override
	public void deleteDisque(Integer id) {
		disqueRepository.delete(disqueRepository.findById(id).get());
		
	}

<<<<<<< HEAD
=======
	@Override
	public void affecterDisqueDatacenter(int idD, int idDc) {
		Disque ds = disqueRepository.findById(idD).orElse(null);
		DataCenter dc = datacenterRepository.findById(idDc).orElse(null);
		dc.getDisques().add(ds);
		datacenterRepository.save(dc);
	}

>>>>>>> 47d7bdae18ef243494cb7f49ff83b2581caf1e04
}
