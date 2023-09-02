package com.demo.oragejobsearch.controllers;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.oragejobsearch.compempreg.EmployerAccountReg;
import com.demo.oragejobsearch.empaccrepo.EmployerAccountRegRepo;
import com.demo.oragejobsearch.empcont.ContactRepo;


import com.demo.oragejobsearch.empdetailrepo.EmpDetailRepo;
import com.demo.oragejobsearch.employercontact.EmployerContact;
import com.demo.oragejobsearch.employerdetails.EmployerDetails;
import com.demo.oragejobsearch.employerlog.EmployerLogIn;
import com.demo.oragejobsearch.employerrepo.EmployerRepo;
import com.demo.oragejobsearch.jobpost.JobPost;
import com.demo.oragejobsearch.jobpostrepo.JobPostRepo;
import com.demo.oragejobsearch.userform.UserForm;
import com.demo.oragejobsearch.userformrepo.UserFormRepo;
import com.demo.oragejobsearch.usermail.UserMail;
import com.demo.oragejobsearch.userregister.UserRegister;
import com.demo.oragejobsearch.userregisterrepo.UserRegisterRepo;
import com.demo.oragejobsearch.userrepo.UserRepo;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserController {
	
	@Autowired
	private UserRepo urepo;
	
	@Autowired
	private UserRegisterRepo uregister;
	
	@Autowired
	private EmployerRepo employerrepo;
	
	@Autowired
	private EmpDetailRepo emprepodetail;
	
	@Autowired
	private UserFormRepo userrepo;
	
	
	
	
	@Autowired
	private ContactRepo contrepo;
	
	
	@Autowired
	private EmployerAccountRegRepo empaccregrepo;
	
	@Autowired
	private JobPostRepo jpr;
	
	//User mail insert 
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertusermail")
	public UserMail insertusermail(@RequestBody UserMail c1)
	{
		String checkumail = c1.getUsermail();
		boolean checkmail = checkMailUser(checkumail);
		if(checkmail) {
			return urepo.save(c1);
		}
		return c1;
		
		
	}
	
	private boolean checkMailUser(String checkumail) {
		// TODO Auto-generated method stub
		  List<UserMail> allMails = urepo.findAll();
		  for (UserMail userMail : allMails) {
		        if (userMail.getUsermail().equals(checkumail)) {
		            return false; // Email already exists
		        }
		    }
		return true;
	}

	//user Mail check
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/viewmailservice")
	public List<UserMail> viewmailservice(){
		return urepo.findAll();
	}
	
	//user register insert
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertuserdetail")
	public UserRegister insertuserdetail(@RequestBody UserRegister u1)
	{
		String checkmail = u1.getEmailuser();
		String checkpass = u1.getPassuser();
		boolean checkdetail = checkDetailUser(checkmail,checkpass);
		if(checkdetail) {
			return uregister.save(u1);
		}
		return u1;
	}
	
	private boolean checkDetailUser(String checkmail, String checkpass) {
		// TODO Auto-generated method stub
		List<UserRegister> alldetail = uregister.findAll();
		for(UserRegister userregister : alldetail) {
			  if ((userregister.getEmailuser().equals(checkmail)) && (userregister.getPassuser().equals(checkpass)) ) {
		            return false; // Email already exists
		        }
		}
		return true;
	}

	
	
	
//   @GetMapping("/api/endpoint")
//   public String myEndpoint(@CookieValue("cookieName") String cookieValue) {
//        return "Cookie value: " + cookieValue;
//   }
//	
	
	//user check sign-in
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/viewuserdetailservice")
	public List<UserRegister> viewuserdetailservice(){
		return uregister.findAll();
	}
	
	
	//employer mail insert 
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertempmailadd")
	public EmployerLogIn insertempmailadd(@RequestBody EmployerLogIn e1)
	{
		String checkempmail = e1.getEmpmail();
		boolean checkemmail = checkMailEmp(checkempmail);
		if(checkemmail) {
			return employerrepo.save(e1);
		}
		return e1;
		
		
	}
	
	private boolean checkMailEmp(String checkempmail) {
		// TODO Auto-generated method stub
		  List<EmployerLogIn> allMailsemp = employerrepo.findAll();
		  for (EmployerLogIn empMail : allMailsemp) {
		        if (empMail.getEmpmail().equals(checkempmail)) {
		            return false; // Email already exists
		        }
		    }
		return true;
	}

	//employer Mail check
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/viewmailserviceemp")
	public List<EmployerLogIn> viewmailserviceemp(){
		return employerrepo.findAll();
	}
	
	
	
	//employer register insert
		@CrossOrigin(origins="http://localhost:4200")
		@PostMapping("/insertempdetail")
		public EmployerDetails insertempdetail(@RequestBody EmployerDetails ed1)
		{
			String checkmailemp = ed1.getEmpmailid();
			String checkpassemp = ed1.getEmppass();
			boolean checkdetailempl = checkDetailEmployer(checkmailemp,checkpassemp);
			if(checkdetailempl) {
				return emprepodetail.save(ed1);
			}
			return ed1;
		}
		
		private boolean checkDetailEmployer(String checkmailemp, String checkpassemp) {
			// TODO Auto-generated method stub
			List<EmployerDetails> alldetailemplo = emprepodetail.findAll();
			for(EmployerDetails empregister : alldetailemplo) {
				  if ((empregister.getEmpmailid().equals(checkmailemp)) && (empregister.getEmppass().equals(checkpassemp)) ) {
			            return false; // Email already exists
			        }
			}
			return true;
		}

		
		
		
		//employer check sign-on
		@CrossOrigin(origins="http://localhost:4200")
		@GetMapping("/viewemployerdetailservice")
		public List<EmployerDetails> viewemployerdetailservice(){
			return emprepodetail.findAll();
		}
		
		
		
		//insert contact info employer
		@CrossOrigin(origins="http://localhost:4200")
		@PostMapping("/insertcontactempl")
		public EmployerContact insertcontactempl(@RequestBody EmployerContact ec)
		{
			
				return contrepo.save(ec);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//User form insert 
		@CrossOrigin(origins="http://localhost:4200")
		@PostMapping("/insertuserform")
		public UserForm insertuserform(@RequestBody UserForm uf)
		{
			return userrepo.save(uf);		
		}
		
		//get the user form details
		@CrossOrigin(origins="http://localhost:4200")
		@GetMapping("/viewformuser")
		public List<UserForm> viewformuser(){
			return userrepo.findAll();
		}
		
		
		
		//Employer Register Account  form insert 
		@CrossOrigin(origins="http://localhost:4200")
		@PostMapping("/insertemployeraccount")
		public EmployerAccountReg insertemployeraccount(@RequestBody EmployerAccountReg ear)
		{
			return empaccregrepo.save(ear);		
		}
		
		@CrossOrigin(origins="http://localhost:4200")
		@GetMapping("/showempdet")
		public List<EmployerAccountReg> showempdet(){
			return empaccregrepo.findAll();
		}
		
		
		//Job Post Details Insert  form insert 
		@CrossOrigin(origins="http://localhost:4200")
		@PostMapping("/jobpostinsert")
		public JobPost jobpostinsert(@RequestBody JobPost jobp)
		{
			return jpr.save(jobp);		
		}
		
		
		
		
		
		//Job Post Details check 
		@CrossOrigin(origins="http://localhost:4200")
		@GetMapping("/viewjobpostdet")
		public List<JobPost> viewjobpostdet(){
			return jpr.findAll();
		}
		
		
		
		
		
		
		
		
		
}

