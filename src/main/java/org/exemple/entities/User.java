package org.exemple.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class User implements Serializable {


@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

private String firstname;

private String lastname;

private String mail;

private String password;

@ManyToMany
private Collection<Groupe>groupes;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Collection<Groupe> getGroupes() {
	return groupes;
}

public void setGroupes(Collection<Groupe> groupes) {
	this.groupes = groupes;
}

public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(String firstname, String lastname, String mail, String password) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.mail = mail;
	this.password = password;
}


}