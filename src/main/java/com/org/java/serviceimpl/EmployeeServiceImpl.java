package com.org.java.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.java.entity.Employee;
import com.org.java.repository.EmployeeRepository;
import com.org.java.service.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.delete(employee);
	}

	@Override
	public Employee findByEmpName(String empName) {
		// TODO Auto-generated method stub
		Employee emp=employeeRepository.findByName(empName);
		return emp;
	}

	@Override
	public Employee findByEmpId(int empId) {
		// TODO Auto-generated method stub
		Employee emp=employeeRepository.findByEmpId(empId);
		return emp;
	}

	@Override
	public List<Employee> findAllEmployeeDetails() {
		// TODO Auto-generated method stub
		List<Employee> list=employeeRepository.findAll();
		return list;
	}

}
