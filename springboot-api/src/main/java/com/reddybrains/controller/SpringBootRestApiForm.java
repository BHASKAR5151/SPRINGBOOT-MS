package com.reddybrains.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SpringBootRestApiForm {
	
	@Id
	private Long id;
	private String empName;
	private String empAddr;
	private String empMobileNo;
	
	
	
	
	public SpringBootRestApiForm() {
		
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}

	public String getEmpMobileNo() {
		return empMobileNo;
	}

	public void setEmpMobileNo(String empMobileNo) {
		this.empMobileNo = empMobileNo;
	}

	public SpringBootRestApiForm(Long id, String empName, String empAddr, String empMobileNo) {
		super();
		this.id = id;
		this.empName = empName;
		this.empAddr = empAddr;
		this.empMobileNo = empMobileNo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
