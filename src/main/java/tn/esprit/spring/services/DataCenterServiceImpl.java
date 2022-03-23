package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entities.DataCenter;
import tn.esprit.spring.entities.VirtualMachine;
import tn.esprit.spring.repositories.IDataCenterRepository;

@Service
@Slf4j
public class DataCenterServiceImpl implements IDataCenterService {

	@Autowired
	IDataCenterRepository dataCenterRepository;
	@Override
	public void ajouterDc(DataCenter dataCenter) {
		dataCenterRepository.save(dataCenter);
	}
	@Override
	public List<DataCenter> listerDataCenter() {
		return dataCenterRepository.listerDataCenter();
	}
	
	@Scheduled(cron="*/10 * * * * *")
	public void getDataCenters(){
		for(DataCenter dataCenter:listerDataCenter()){
			log.info("Data Center : "+dataCenter.getRegion());
			for(VirtualMachine vm:dataCenter.getVms()){
				log.info("OS : "+vm.getOs());
			}
		}
	}

}
