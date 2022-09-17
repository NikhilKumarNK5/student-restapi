package com.nikhil.restapi.request;

import java.util.List;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class CreateStudentRequest {
	
	@NotBlank(message = "First name is requried")
	private String firstName;
	private String lastName;
	private String email;
	private String street;
	private String city;
	private List<CreateSubjectRequest> subjectsLearning;
}
