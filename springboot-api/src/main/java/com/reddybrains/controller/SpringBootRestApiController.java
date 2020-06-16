package com.reddybrains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.reddybrains.service.SpringBootRestApiService;

@RestController
public class SpringBootRestApiController {

	@Autowired
	private SpringBootRestApiService service;

	/*
	 * @RequestMapping("/employees") public List getAllEmployes() { service. }
	 * 
	 * @RequestMapping("/employees/{id}") public void updateEmplee() {
	 * 
	 * 
	 * }
	 */
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public void saveEmplee(@RequestBody SpringBootRestApiForm form) {
		System.out.println("Controller Name");
		service.saveEmployee(form);

	}
	
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public SpringBootRestApiForm getEmplee(@PathVariable Long id) {
		System.out.println("Controller Name");
		return service.getEmployee(id);

	}
}
