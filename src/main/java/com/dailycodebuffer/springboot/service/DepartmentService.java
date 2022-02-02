package com.dailycodebuffer.springboot.service;

import java.util.List;

import com.dailycodebuffer.springboot.entity.Department;
import com.dailycodebuffer.springboot.exception.DepartmentNotFoundException;

public interface DepartmentService {

	Department createDepartment(Department department);

	List<Department> getAllDepartment();

	Department findDepartmentById(Long departmentid) throws DepartmentNotFoundException;

	Department updateDepartment(Long departmentid,Department department);

	void deleteDepartment(Long departmentId);

	Department getDepartmentByName(String departmentName);

}
