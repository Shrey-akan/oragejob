package com.demo.oragejobsearch.empcont;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.demo.oragejobsearch.employercontact.EmployerContact;
import com.demo.oragejobsearch.userregister.UserRegister;

@Repository
public interface ContactRepo extends JpaRepository<EmployerContact, Integer>{

}
