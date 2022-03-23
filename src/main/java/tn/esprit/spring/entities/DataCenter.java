package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class DataCenter implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDs;
	private String region;
	@Temporal(TemporalType.DATE)
	private Date dateFabriquation;
	private int capaciteDisque;
	private int espaceLibreDisque;
	@JsonIgnore
	@OneToMany(mappedBy="dataCenter", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private List<VirtualMachine> vms;
	public DataCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getIdDs() {
		return idDs;
	}
	public void setIdDs(Integer idDs) {
		this.idDs = idDs;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Date getDateFabriquation() {
		return dateFabriquation;
	}
	public void setDateFabriquation(Date dateFabriquation) {
		this.dateFabriquation = dateFabriquation;
	}
	public int getCapaciteDisque() {
		return capaciteDisque;
	}
	public void setCapaciteDisque(int capaciteDisque) {
		this.capaciteDisque = capaciteDisque;
	}
	public int getEspaceLibreDisque() {
		return espaceLibreDisque;
	}
	public void setEspaceLibreDisque(int espaceLibreDisque) {
		this.espaceLibreDisque = espaceLibreDisque;
	}
	public List<VirtualMachine> getVms() {
		return vms;
	}
	public void setVms(List<VirtualMachine> vms) {
		this.vms = vms;
	}
	
}
