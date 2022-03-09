package org.exemple.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RE")
public class Referent extends User {

	public Referent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Referent(String firstname, String lastname, String mail, String password) {
		super(firstname, lastname, mail, password);
		// TODO Auto-generated constructor stub
	}

}
