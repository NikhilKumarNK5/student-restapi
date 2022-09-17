package com.nikhil.restapi.request;

import java.util.List;

import lombok.Data;

@Data
public class InQueryRequest {
	private List<String> firstNames;
}
