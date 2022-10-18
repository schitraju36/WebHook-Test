package com.example.webhook.request;

import java.util.List;

import lombok.Data;

@Data
public class TextMsg {

	private String object;
	
	private List<Entry> entry;
}
