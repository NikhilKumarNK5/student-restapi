package com.nikhil.restapi.request;

import lombok.Data;

@Data
public class CreateSubjectRequest {
	private String subjectName;
	private Double marksObtained;
}
