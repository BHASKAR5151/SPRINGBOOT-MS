package com.reddybrains.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reddybrains.controller.SpringBootRestApiForm;
import com.reddybrains.repositary.SpringBootRestApiRepositary;

@Service
public class SpringBootRestApiService {

	@Autowired
	private SpringBootRestApiRepositary repositary;

	public void saveEmployee(SpringBootRestApiForm form) {
		repositary.save(form);

	}

	public SpringBootRestApiForm getEmployee(Long id) {
		return repositary.findOne(id);
	}
}
