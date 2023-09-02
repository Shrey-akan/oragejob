package com.demo.oragejobsearch.userformrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.oragejobsearch.employerdetails.EmployerDetails;
import com.demo.oragejobsearch.userform.UserForm;

@Repository
public interface UserFormRepo extends JpaRepository<UserForm , Integer>{

}
