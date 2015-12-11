package com.zazu.model;

/**
 * @author Zazu
 * Class which represents a Jira subtask.
 */
public class Subtask {
	
	private String summary;
	private String description;
	
	public Subtask(String summary, String description) {
		super();
		this.summary = summary;
		this.description = description;
	}
	
	public String getSummary() {
		return summary;
	}
	
	public String getDescription() {
		return description;
	}
}
