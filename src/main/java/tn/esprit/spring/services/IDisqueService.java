package tn.esprit.spring.services;

import tn.esprit.spring.entities.Disque;

public interface IDisqueService {

	void ajouterDisque(Disque disque);
	void deleteDisque(Integer id);

	void affecterDisqueDatacenter(int idD, int idDc);

}
