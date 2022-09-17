package com.nikhil.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nikhil.restapi.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	List<Student> findByFirstName(String firstname);
	Student findByFirstNameAndLastName(String firstname, String lastname);
	List<Student> findByFirstNameOrLastName(String firstname, String lastname);
	List<Student> findByFirstNameIn(List<String> firstnames);
	List<Student> findByFirstNameContains(String firstname);
	List<Student> findByFirstNameStartsWith(String firstname);
	List<Student> findByAddressCity(String city);
	
	@Query(value = "select * from student where firstName = :firstName and lastName = :lastName", nativeQuery = true)
	Student getByFirstNameAndLastName(String firstName, String lastName);
	
	@Modifying
	@Transactional
	@Query(value = "update student set firstName = :firstName where id = :id", nativeQuery = true)
	Integer updateFirstName(Long id, String firstName);
	
	@Modifying
	@Transactional
	@Query(value = "delete from student where firstName = :firstName", nativeQuery = true)
	Integer deleteByFirstName(String firstName);
	
}
