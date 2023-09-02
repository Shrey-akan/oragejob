package com.demo.oragejobsearch.userregisterrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.oragejobsearch.usermail.UserMail;
import com.demo.oragejobsearch.userregister.UserRegister;

@Repository
public interface UserRegisterRepo extends JpaRepository<UserRegister, Integer>{

	
	
}
