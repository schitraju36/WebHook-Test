package com.example.webhook.request;

import java.util.List;

import lombok.Data;

@Data
public class Changes {
	
	private Value value;
	
	private String field;
	
}
