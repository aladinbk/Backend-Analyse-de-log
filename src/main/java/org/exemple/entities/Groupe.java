package org.exemple.entities;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany; 

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Groupe implements Serializable {
	@Id
    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
    private Long id_G;
    
    private String nom_G;
    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER,mappedBy = "groupes")    
    private Collection<User>users;
	
    public Long getId_G() {
		return id_G;
	}
	public void setId_G(Long id_G) {
		this.id_G = id_G;
	}
	public String getNom_G() {
		return nom_G;
	}
	public void setNom_G(String nom_G) {
		this.nom_G = nom_G;
	}
	public Collection<User> getUsers() {
		return users;
	}
	public void setUsers(Collection<User> users) {
		this.users = users;
	}
	public Groupe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Groupe(String nom_G) {
		super();
		this.nom_G = nom_G;
	}
    
}
