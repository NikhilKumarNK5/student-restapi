package com.nikhil.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhil.restapi.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long>{
	
}
