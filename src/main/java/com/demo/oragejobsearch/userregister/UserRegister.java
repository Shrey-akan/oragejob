package com.demo.oragejobsearch.userregister;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserRegister {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int uid;
		private String fnameuser;
		private String lnameuser;
		private String emailuser;
		private String companyuser;
		private String websiteuser;
		private String userphone;
		private String usercountry;
		private String userstate;
		private String usercity;
		private String passuser;
		public UserRegister() {
			super();
			// TODO Auto-generated constructor stub
		}
		public UserRegister(int uid, String fnameuser, String lnameuser, String emailuser, String companyuser,
				String websiteuser, String userphone, String usercountry, String userstate, String usercity,
				String passuser) {
			super();
			this.uid = uid;
			this.fnameuser = fnameuser;
			this.lnameuser = lnameuser;
			this.emailuser = emailuser;
			this.companyuser = companyuser;
			this.websiteuser = websiteuser;
			this.userphone = userphone;
			this.usercountry = usercountry;
			this.userstate = userstate;
			this.usercity = usercity;
			this.passuser = passuser;
		}
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public String getFnameuser() {
			return fnameuser;
		}
		public void setFnameuser(String fnameuser) {
			this.fnameuser = fnameuser;
		}
		public String getLnameuser() {
			return lnameuser;
		}
		public void setLnameuser(String lnameuser) {
			this.lnameuser = lnameuser;
		}
		public String getEmailuser() {
			return emailuser;
		}
		public void setEmailuser(String emailuser) {
			this.emailuser = emailuser;
		}
		public String getCompanyuser() {
			return companyuser;
		}
		public void setCompanyuser(String companyuser) {
			this.companyuser = companyuser;
		}
		public String getWebsiteuser() {
			return websiteuser;
		}
		public void setWebsiteuser(String websiteuser) {
			this.websiteuser = websiteuser;
		}
		public String getUserphone() {
			return userphone;
		}
		public void setUserphone(String userphone) {
			this.userphone = userphone;
		}
		public String getUsercountry() {
			return usercountry;
		}
		public void setUsercountry(String usercountry) {
			this.usercountry = usercountry;
		}
		public String getUserstate() {
			return userstate;
		}
		public void setUserstate(String userstate) {
			this.userstate = userstate;
		}
		public String getUsercity() {
			return usercity;
		}
		public void setUsercity(String usercity) {
			this.usercity = usercity;
		}
		public String getPassuser() {
			return passuser;
		}
		public void setPassuser(String passuser) {
			this.passuser = passuser;
		}
		
		
		
		
		
}
