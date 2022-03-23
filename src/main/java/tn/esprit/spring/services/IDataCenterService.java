package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.DataCenter;

public interface IDataCenterService {
	 
	void ajouterDc(DataCenter dataCenter);
	List<DataCenter> listerDataCenter();
	
}
