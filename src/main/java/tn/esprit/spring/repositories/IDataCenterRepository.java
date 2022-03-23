package tn.esprit.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.DataCenter;

@Repository
public interface IDataCenterRepository extends CrudRepository<DataCenter, Integer> {

	@Query("Select dc From DataCenter dc where dc.dateFabriquation > '2019-11-01'")
	List<DataCenter> listerDataCenter();
	
}
