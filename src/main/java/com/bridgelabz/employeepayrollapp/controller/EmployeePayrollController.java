package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

@RestController
@RequestMapping("/employeepayroll")

/**
 *  Controller : EmployeePayRollController
 * @author Amol
 *
 */

public class EmployeePayrollController {
	/**
	 * get method 
	 * @return response
	 */
	@GetMapping("/get")
	public ResponseEntity<String> getEmployeePayrollData(){
		return new ResponseEntity<String>("Get Call Success",HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Get Call Success for id:"+empId,HttpStatus.OK);
	}
	
	/*
	 * post method to add details
	 * return --id name salary
	 */
	@PostMapping("/create")
	public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
		return new ResponseEntity<String>("Created Employee payroll data for:"+employeePayrollDTO,HttpStatus.OK);
	}
	
	/*
	 * method to update details
	 * return -- id, name & salary
	 * 
	 */
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
		return new ResponseEntity<String>("Updated Employee payroll Data for: "+employeePayrollDTO,HttpStatus.OK);
	}
	
	/*
	 * method to remove employee details
	 * @return -- Employee id which is deleted
	 */
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Delete Call Success for id: "+empId,HttpStatus.OK);
	}
	
}