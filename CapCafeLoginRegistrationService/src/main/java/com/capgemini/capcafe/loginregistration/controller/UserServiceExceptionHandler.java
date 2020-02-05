package com.capgemini.capcafe.loginregistration.controller;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.capgemini.capcafe.loginregistration.exception.UserException;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
@RestController
public class UserServiceExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(UserException.class)
	@ResponseBody
	public ResponseEntity<Object> HandleProductNotFound(UserException error) {
		System.out.println("Exception: " + error.getMessage());
		return new ResponseEntity<>(error.getMessage(), HttpStatus.NOT_FOUND);
	}

}
