package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Disque implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private Long capacite ;
	
	@ManyToOne
	private DataCenter dataCenter;
	
	
	
	
	public DataCenter getDataCenter() {
		return dataCenter;
	}
	public void setDataCenter(DataCenter dataCenter) {
		this.dataCenter = dataCenter;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Long getCapacite() {
		return capacite;
	}
	public void setCapacite(Long capacite) {
		this.capacite = capacite;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Disque(Integer id, String nom, Long capacite) {
		super();
		this.id = id;
		this.nom = nom;
		this.capacite = capacite;
	}
	public Disque() {
		super();
	} 
	
	
	
}
