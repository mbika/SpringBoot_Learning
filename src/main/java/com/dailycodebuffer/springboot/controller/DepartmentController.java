package com.dailycodebuffer.springboot.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.springboot.entity.Department;
import com.dailycodebuffer.springboot.exception.DepartmentNotFoundException;
import com.dailycodebuffer.springboot.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentservice;

	private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

	@PostMapping(value = "/saveDepartment")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		LOGGER.info("Inside saveDepartment of DepartmentController");
		return departmentservice.createDepartment(department);
	}

	@GetMapping(value = "/retriveAllDepartment")
	public List<Department> retriveAllDepartment() {
		LOGGER.info("Inside retriveAllDepartment of DepartmentController");
		return departmentservice.getAllDepartment();
	}

	@GetMapping(value = "/retrivesingleDepartment/{id}")
	public Department getSingleDepartment(@PathVariable("id") Long departmentid) throws DepartmentNotFoundException {
		LOGGER.info("Inside getSingleDepartment of DepartmentController");
		return departmentservice.findDepartmentById(departmentid);
	}

	@DeleteMapping(value = "deleteDepartment/{id}")
	public void deleteDepartment(@PathVariable("id") Long departmentId) {
		LOGGER.info("Inside deleteDepartment of DepartmentController");
		departmentservice.deleteDepartment(departmentId);
	}

	@PutMapping(value = "/updateDepartment")
	public Department updateDepartment(@PathVariable("id") Long Id, @RequestBody Department department) {
		LOGGER.info("Inside updateDepartment of DepartmentController");
		return departmentservice.updateDepartment(Id, department);
	}

	@GetMapping(value = "/basedonDepartmentName/{departmentName}")
	public Department findByDepartmentName(@PathVariable("departmentName") String departmentName) {
		LOGGER.info("Inside findByDepartmentName of DepartmentController");
		return departmentservice.getDepartmentByName(departmentName);
	}
}
