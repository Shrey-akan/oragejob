package com.demo.oragejobsearch.employerlog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployerLogIn {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String empmail;
	public EmployerLogIn(int eid, String empmail) {
		super();
		this.eid = eid;
		this.empmail = empmail;
	}
	public EmployerLogIn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmpmail() {
		return empmail;
	}
	public void setEmpmail(String empmail) {
		this.empmail = empmail;
	}
	
	
	
	
}
