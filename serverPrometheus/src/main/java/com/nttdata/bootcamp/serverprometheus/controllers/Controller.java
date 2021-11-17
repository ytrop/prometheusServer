package com.nttdata.bootcamp.serverprometheus.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {
	private final static Logger logger = LoggerFactory.getLogger(Controller.class);
	String status;
	String open = "open";
	String halFopen ="half open";
	String close ="close";

	
	@GetMapping("/open")
	public ResponseEntity<String> setToOpen(){
		status = open;
		logger.info("Status client:" + status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
	@GetMapping("/half-open")
	public ResponseEntity<String> setToHalFopen(){
		status = open;
		logger.info("Status client:" + status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
	@GetMapping("/close")
	public ResponseEntity<String> setToClose(){
		status = halFopen;
		logger.info("Status client:" + status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}

}
