package com.dailycodebuffer.springboot.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.dailycodebuffer.springboot.exception.DepartmentNotFoundException;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(DepartmentNotFoundException.class)
	public ResponseEntity<ApiResponse> departmentNotFoundException(DepartmentNotFoundException exception,
			WebRequest request) {
		ApiResponse response = new ApiResponse(HttpStatus.NOT_FOUND, exception.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

	}
}
