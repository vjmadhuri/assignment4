package com.gl.vm.employeeMsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.vm.employeeMsystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);

	List<Employee> findAllByOrderByFirstNameAsc();

}