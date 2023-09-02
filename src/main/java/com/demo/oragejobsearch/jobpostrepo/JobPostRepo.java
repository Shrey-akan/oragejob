package com.demo.oragejobsearch.jobpostrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.oragejobsearch.jobpost.JobPost;

@Repository
public interface JobPostRepo extends JpaRepository<JobPost, Integer>{

}
