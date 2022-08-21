package com.empcrudex.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Empl_TB")
public class Empl {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int emplid;
	private String emplname;
	private String emplemail;
	
	public Empl() {
		super();
	}
	public Empl(int emplid, String emplname, String emplemail) {
		super();
		this.emplid = emplid;
		this.emplname = emplname;
		this.emplemail = emplemail;
	}
	public int getEmplid() {
		return emplid;
	}
	public void setEmplid(int emplid) {
		this.emplid = emplid;
	}
	public String getEmplname() {
		return emplname;
	}
	public void setEmplname(String emplname) {
		this.emplname = emplname;
	}
	public String getEmplemail() {
		return emplemail;
	}
	public void setEmplemail(String emplemail) {
		this.emplemail = emplemail;
	}
	
	
}
