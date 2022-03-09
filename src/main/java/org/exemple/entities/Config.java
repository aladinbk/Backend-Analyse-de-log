package org.exemple.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Config implements Serializable{
	@Id
	private Long id;
	private String fileUrl;
	private String split;
	private Level levles;
	public Config() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Config(String fileUrl, String split, Level levles) {
		super();
		this.fileUrl = fileUrl;
		this.split = split;
		this.levles = levles;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getSplit() {
		return split;
	}
	public void setSplit(String split) {
		this.split = split;
	}
	public Level getLevles() {
		return levles;
	}
	public void setLevles(Level levles) {
		this.levles = levles;
	}
	

}
