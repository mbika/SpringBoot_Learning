package com.dailycodebuffer.springboot.serviceImpl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.springboot.entity.Department;
import com.dailycodebuffer.springboot.exception.DepartmentNotFoundException;
import com.dailycodebuffer.springboot.repo.DepartmentRepository;
import com.dailycodebuffer.springboot.service.DepartmentService;

@Service
public class DepartmentImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentrepo;

	@Override
	public Department createDepartment(Department department) {
		return departmentrepo.save(department);
	}

	@Override
	public List<Department> getAllDepartment() {
		List<Department> departmentList = departmentrepo.findAll();
		return departmentList;
	}

	@Override
	public Department findDepartmentById(Long departmentid) throws DepartmentNotFoundException {
		Optional<Department> department = departmentrepo.findById(departmentid);
		if (!department.isPresent()) {
			throw new DepartmentNotFoundException("Department not found");
		} 

		return department.get();
	}

	@Override
	public Department updateDepartment(Long departmentid, Department department) {
		Department dbDepart = departmentrepo.findById(departmentid).get();
		if (Objects.nonNull(dbDepart)) {
			dbDepart.setDepartmentName(department.getDepartmentName());
			dbDepart.setDepartmentAddress(department.getDepartmentAddress());
			dbDepart.setDepartmentCode(department.getDepartmentCode());
		}
		return departmentrepo.save(dbDepart);
	}

	@Override
	public void deleteDepartment(Long departmentId) {
		departmentrepo.deleteById(departmentId);
	}

	@Override
	public Department getDepartmentByName(String departmentName) {
		Department department =departmentrepo.findByDepartmentName(departmentName);
		return department;
	}

}
