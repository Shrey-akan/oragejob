package com.demo.oragejobsearch.employercontact;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployerContact {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int contactid;
private String contacthelp;
private String contactname;
private String contactmail;
private String contactcompany;
private String contactphone;




public EmployerContact() {
	super();
	// TODO Auto-generated constructor stub
}
public EmployerContact(int contactid, String contacthelp, String contactname, String contactmail, String contactcompany,
		String contactphone) {
	super();
	this.contactid = contactid;
	this.contacthelp = contacthelp;
	this.contactname = contactname;
	this.contactmail = contactmail;
	this.contactcompany = contactcompany;
	this.contactphone = contactphone;
}
public int getContactid() {
	return contactid;
}
public void setContactid(int contactid) {
	this.contactid = contactid;
}
public String getContacthelp() {
	return contacthelp;
}
public void setContacthelp(String contacthelp) {
	this.contacthelp = contacthelp;
}
public String getContactname() {
	return contactname;
}
public void setContactname(String contactname) {
	this.contactname = contactname;
}
public String getContactmail() {
	return contactmail;
}
public void setContactmail(String contactmail) {
	this.contactmail = contactmail;
}
public String getContactcompany() {
	return contactcompany;
}
public void setContactcompany(String contactcompany) {
	this.contactcompany = contactcompany;
}
public String getContactphone() {
	return contactphone;
}
public void setContactphone(String contactphone) {
	this.contactphone = contactphone;
}




}
