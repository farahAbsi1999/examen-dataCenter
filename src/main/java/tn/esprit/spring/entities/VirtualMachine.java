package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class VirtualMachine implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVm;
	private String os;
	private int tailleDisque;
	@Enumerated(EnumType.STRING)
	private Etat etat;
	@ManyToOne
	private DataCenter dataCenter;
	
	public DataCenter getDataCenter() {
		return dataCenter;
	}

	public void setDataCenter(DataCenter dataCenter) {
		this.dataCenter = dataCenter;
	}

	public VirtualMachine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdVm() {
		return idVm;
	}

	public void setIdVm(Integer idVm) {
		this.idVm = idVm;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getTailleDisque() {
		return tailleDisque;
	}

	public void setTailleDisque(int tailleDisque) {
		this.tailleDisque = tailleDisque;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	
	
	
}
