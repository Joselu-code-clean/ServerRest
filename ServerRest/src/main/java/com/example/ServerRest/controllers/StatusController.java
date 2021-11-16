package com.example.ServerRest.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
	
	Logger logger = LoggerFactory.getLogger(StatusController.class);
	
	
	String status;
	String close = "close";
	String open;
	String halfOpen = "half-open";
	
	
	
	@GetMapping("/close")
	public ResponseEntity<String> setToClose(){
		status = "close";
		logger.info("Estado ---- "+status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
	
	@GetMapping("/open")
	public ResponseEntity<String> setToOpen(){
		status = open;
		logger.info("Estado ---- "+status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	

	
	@GetMapping("/half-open")
	public ResponseEntity<String> setToHalfOpen(){
		status = "half-open";
		logger.info("Estado ---- "+status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
}
