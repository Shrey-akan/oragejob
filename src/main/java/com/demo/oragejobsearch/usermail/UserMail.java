package com.demo.oragejobsearch.usermail;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserMail {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String usermail;
	public UserMail(int userid, String usermail) {
		super();
		this.userid = userid;
		this.usermail = usermail;
	}
	public UserMail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	
	
	
}
