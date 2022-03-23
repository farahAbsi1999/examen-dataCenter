package tn.esprit.spring.services;

import tn.esprit.spring.entities.VirtualMachine;

public interface IVmService {

	int ajouterVm(VirtualMachine vm);
	void affecterVmUser(int idVm, int idUser);
	void affecterVm(int idVm);
	void demarrerInstanceUser(int idVm);
	void arreterInstanceUser(int idVm);
}
