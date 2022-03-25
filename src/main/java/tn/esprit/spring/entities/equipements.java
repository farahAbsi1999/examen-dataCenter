package tn.esprit.spring.entities;
import java.io.Serializable;

public class equipements implements Serializable {
	private Integer id;
	private String nom;
	private Integer ref ;
	private String categorie;

	

	public equipements(Integer id, String nom, Integer ref, String categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.ref = ref;
		this.categorie = categorie;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer idE) {
		this.id = idE;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getRef() {
		return ref;
	}
	public void setRef(Integer ref) {
		this.ref = ref;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
}
