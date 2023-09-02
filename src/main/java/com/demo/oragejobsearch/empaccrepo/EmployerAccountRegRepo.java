package com.demo.oragejobsearch.empaccrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.oragejobsearch.compempreg.EmployerAccountReg;

@Repository
public interface EmployerAccountRegRepo extends JpaRepository<EmployerAccountReg,Integer>{
	
	
	
	
}
