package com.example.demo.model;

import java.util.Date;

public class ErrorDetails {
	  private Date timestamp;
	  private String message;
	  private String field;
	  private String details;

	  public ErrorDetails(Date timestamp, String message, String field, String details) {
	    this.timestamp = timestamp;
	    this.message = message;
	    this.setField(field);
	    this.details = details;
	  }

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	  
	  
}
