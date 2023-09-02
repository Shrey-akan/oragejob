package com.demo.oragejobsearch.userrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.oragejobsearch.usermail.UserMail;

@Repository
public interface UserRepo extends JpaRepository<UserMail, Integer>{

	

}
