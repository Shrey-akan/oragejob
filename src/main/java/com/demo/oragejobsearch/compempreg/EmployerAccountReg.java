package com.demo.oragejobsearch.compempreg;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployerAccountReg {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eaid;
	private String companyName;
	private Long employeesRange;
	private String firstName;
	private String lastName;
	private Long phoneNumber;
	private String howHeard;
	public EmployerAccountReg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployerAccountReg(int eaid, String companyName, Long employeesRange, String firstName, String lastName,
			Long phoneNumber, String howHeard) {
		super();
		this.eaid = eaid;
		this.companyName = companyName;
		this.employeesRange = employeesRange;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.howHeard = howHeard;
	}
	public int getEaid() {
		return eaid;
	}
	public void setEaid(int eaid) {
		this.eaid = eaid;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Long getEmployeesRange() {
		return employeesRange;
	}
	public void setEmployeesRange(Long employeesRange) {
		this.employeesRange = employeesRange;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getHowHeard() {
		return howHeard;
	}
	public void setHowHeard(String howHeard) {
		this.howHeard = howHeard;
	}

	
	
}
