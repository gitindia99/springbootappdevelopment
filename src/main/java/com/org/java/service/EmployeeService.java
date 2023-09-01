package com.org.java.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.java.entity.Employee;

@Service
public interface EmployeeService {

	Employee saveEmployeeDetails(Employee employee);

	Employee updateEmployeeDetails(Employee employee);

	void deleteEmployeeDetails(Employee employee);

	Employee findByEmpName(String empName);

	Employee findByEmpId(int empId);

	List<Employee> findAllEmployeeDetails();

}
