package com.demo.oragejobsearch.empdetailrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.oragejobsearch.employerdetails.EmployerDetails;

@Repository
public interface EmpDetailRepo extends JpaRepository<EmployerDetails , Integer> {
	
}
