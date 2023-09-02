package com.demo.oragejobsearch.employerrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.oragejobsearch.employerlog.EmployerLogIn;

@Repository
public interface EmployerRepo extends JpaRepository<EmployerLogIn,Integer>{

}
