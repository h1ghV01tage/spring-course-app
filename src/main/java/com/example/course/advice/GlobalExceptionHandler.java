package com.example.course.advice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<?> handleValidationExceptions(MethodArgumentNotValidException ex){
		
		Map<String, String> errors = ex.getBindingResult()
									.getFieldErrors()
									.stream()
									.collect(Collectors.toMap(
											FieldError -> FieldError.getField(),
											FieldError -> FieldError.getDefaultMessage()));
		
		return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
		

	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleInternalServerError(Exception ex) {
		// Log the exception details for debugging
		// You might want to log more details depending on your logging strategy
		ex.printStackTrace();

		// Prepare a generic error response
		Map<String, Object> errorDetails = new HashMap<>();
		errorDetails.put("message", "An internal error occurred. Please try again later.");
		errorDetails.put("error", ex.getMessage());

		// Return the response entity
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
