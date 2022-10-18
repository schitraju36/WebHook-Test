package com.example.webhook.request;

import java.util.List;

import lombok.Data;

@Data
public class Entry {

	private String id;

	private List<Changes> changes;

}
