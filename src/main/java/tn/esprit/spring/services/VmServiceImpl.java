package tn.esprit.spring.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.DataCenter;
import tn.esprit.spring.entities.Etat;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.entities.VirtualMachine;
import tn.esprit.spring.repositories.IDataCenterRepository;
import tn.esprit.spring.repositories.IUserRepository;
import tn.esprit.spring.repositories.IVMRepository;

@Service
public class VmServiceImpl implements IVmService {
	
	@Autowired
	IVMRepository vmRepository;
	
	@Autowired
	IUserRepository userRepository;
	
	@Autowired
	IDataCenterRepository dataCenterRepository;
	

	@Override
	public int ajouterVm(VirtualMachine vm) {
		return vmRepository.save(vm).getIdVm();
	}

	@Override
	public void affecterVmUser(int idVm, int idUser) {
		VirtualMachine vm = vmRepository.findById(idVm).orElse(null);
		User user = userRepository.findById(idUser).orElse(null);
		user.getVms().add(vm);
		userRepository.save(user);
	}

	@Transactional
	@Override
	public void affecterVm(int idVm) {
		VirtualMachine vm = vmRepository.findById(idVm).orElse(null);
		for(DataCenter dataCenter:dataCenterRepository.findAll()){
			if(dataCenter.getEspaceLibreDisque() > vm.getTailleDisque()){
				int nouveauEspaceLibreDisque = dataCenter.getEspaceLibreDisque() - vm.getTailleDisque();
				dataCenter.setEspaceLibreDisque(nouveauEspaceLibreDisque);
				vm.setDataCenter(dataCenter);
			}
		}
	}

	@Override
	public void demarrerInstanceUser(int idVm) {
		VirtualMachine vm = vmRepository.findById(idVm).orElse(null);
		vm.setEtat(Etat.RUNNING);
		vmRepository.save(vm);
	}

	@Transactional
	@Override
	public void arreterInstanceUser(int idVm) {
		VirtualMachine vm = vmRepository.findById(idVm).orElse(null);
		vm.setEtat(Etat.STOPPED);
	}

}
