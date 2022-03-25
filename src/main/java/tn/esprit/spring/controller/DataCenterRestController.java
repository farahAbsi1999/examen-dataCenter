package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.DataCenter;
import tn.esprit.spring.entities.Disque;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.entities.VirtualMachine;
import tn.esprit.spring.services.IDataCenterService;
import tn.esprit.spring.services.IDisqueService;
import tn.esprit.spring.services.IUserService;
import tn.esprit.spring.services.IVmService;

@RestController
@RequestMapping("/data")
public class DataCenterRestController {

	@Autowired
	IUserService userService;
	
	@Autowired
	IVmService vmService;
	
	@Autowired
	IDataCenterService dataCenterService;
	
	IDisqueService  disqueService ;
	
	@PostMapping("/ajouter-user")
	public void ajouterUser(@RequestBody User user){
		userService.ajouterUser(user);
	}
	
	@DeleteMapping("/remove-User/{User-id}")
	@ResponseBody
	public void removeUser(@PathVariable("User-id") Integer UserId) {
		userService.deleteUser(UserId);
	}
	
	
	
	@PostMapping("/ajouter-Disque")
	public void ajouterDisque(@RequestBody Disque disque){
		disqueService.ajouterDisque(disque);
	}
	
	@DeleteMapping("/remove-Disque/{id}")
	@ResponseBody
	public void removeDisque(@PathVariable("id") Integer Id) {
		disqueService.deleteDisque(Id);
	}
	
	
	
	
	
	@PostMapping("/ajouter-dc")
	public void ajouterDc(@RequestBody DataCenter dataCenter){
		dataCenterService.ajouterDc(dataCenter);
	}
	@PostMapping("/ajouter-vm")
	public void ajouterVm(@RequestBody VirtualMachine vm){
		vmService.ajouterVm(vm);
	}
	
	@PutMapping("/affecter-vm-user/{id-vm}/{id-user}")
	public void affecterVmUser(@PathVariable("id-vm") int idVm, @PathVariable("id-user") int idUser){
		vmService.affecterVmUser(idVm, idUser);
	}
	
	@PutMapping("/affecter-vm/{id-vm}")
	public void affecterVm(@PathVariable("id-vm") int idVm){
		vmService.affecterVm(idVm);
	}
	@PutMapping("/demarrer-vm/{id-vm}")
	public void demarrerVm(@PathVariable("id-vm") int idVm){
		vmService.demarrerInstanceUser(idVm);;
	}
	@PutMapping("/arreter-vm/{id-vm}")
	public void arreterVm(@PathVariable("id-vm") int idVm){ 
		vmService.arreterInstanceUser(idVm);
	}
	@GetMapping("/getDataCenters")
	public List<DataCenter> getDataCenter(){
		return dataCenterService.listerDataCenter();
	}

	
}
