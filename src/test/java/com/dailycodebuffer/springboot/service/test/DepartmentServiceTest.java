package com.dailycodebuffer.springboot.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.dailycodebuffer.springboot.entity.Department;
import com.dailycodebuffer.springboot.repo.DepartmentRepository;
import com.dailycodebuffer.springboot.service.DepartmentService;

@SpringBootTest
public class DepartmentServiceTest {

	@Autowired
	private DepartmentService departmentService;
	
	@MockBean
	private DepartmentRepository departmentRepository;
	
	@BeforeEach
	void setUp() {
		
	}
	
	public void whenValidDepartmentName_thenDepartmentshouldFound() {
		String deprtmentName = "Software";
		Department foundDepartment = departmentService.getDepartmentByName(deprtmentName);
		assertEquals(deprtmentName, foundDepartment.getDepartmentName());
		
	}
	
}
