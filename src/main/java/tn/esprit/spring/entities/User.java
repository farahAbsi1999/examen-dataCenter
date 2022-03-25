package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUser;
	private String prenom;
	private String nom;
	private Integer age;
	private String adresse;
	private String login;
	private String pwd;
	@Enumerated(EnumType.STRING)
	private Genre genre;
	
	
	
	




	public User(Integer idUser, String prenom, String nom, Integer age, String adresse, String login, String pwd,
			Genre genre, Set<VirtualMachine> vms) {
		super();
		this.idUser = idUser;
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.adresse = adresse;
		this.login = login;
		this.pwd = pwd;
		this.genre = genre;
		this.vms = vms;
	}




	public Genre getGenre() {
		return genre;
	}




	public void setGenre(Genre genre) {
		this.genre = genre;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@OneToMany
	@JsonIgnore
	private Set<VirtualMachine> vms;
	
	public User() {
		super();
	}

	
	
	
	public Integer getAge() {
		return age;
	}




	public void setAge(Integer age) {
		this.age = age;
	}




	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Set<VirtualMachine> getVms() {
		return vms;
	}

	public void setVms(Set<VirtualMachine> vms) {
		this.vms = vms;
	}
	
	
	
}
