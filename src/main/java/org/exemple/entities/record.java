package org.exemple.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class record implements Serializable{
    @Id
    @GeneratedValue
	private Long id_Record ;
	private String date;
	private String framework;
    private String adresseIP;
    private String adresseMAC;
    private String description;
	public record() {
		super();
		// TODO Auto-generated constructor stub
	}
	public record(String date, String framework, String adresseIP, String adresseMAC, String description) {
		super();
		this.date = date;
		this.framework = framework;
		this.adresseIP = adresseIP;
		this.adresseMAC = adresseMAC;
		this.description = description;
	}
	public Long getId_Record() {
		return id_Record;
	}
	public void setId_Record(Long id_Record) {
		this.id_Record = id_Record;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFramework() {
		return framework;
	}
	public void setFramework(String framework) {
		this.framework = framework;
	}
	public String getAdresseIP() {
		return adresseIP;
	}
	public void setAdresseIP(String adresseIP) {
		this.adresseIP = adresseIP;
	}
	public String getAdresseMAC() {
		return adresseMAC;
	}
	public void setAdresseMAC(String adresseMAC) {
		this.adresseMAC = adresseMAC;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
