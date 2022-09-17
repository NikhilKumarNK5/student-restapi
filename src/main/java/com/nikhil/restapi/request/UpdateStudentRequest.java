package com.nikhil.restapi.request;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UpdateStudentRequest {
	
	@NotNull(message = "Student id is required")
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
}
