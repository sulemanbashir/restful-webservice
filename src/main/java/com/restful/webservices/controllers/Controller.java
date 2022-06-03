package com.restful.webservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String getAllCurrencySymbols(){
		return "Restful Webservice is up!!";
	}
}
