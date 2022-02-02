package com.dailycodebuffer.springboot.exception.handler;

import org.springframework.http.HttpStatus;

public class ApiResponse {

	private HttpStatus status;
	private String message;

	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApiResponse(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ApiResponse [status=");
		builder.append(status);
		builder.append(", message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}
	
	

}
