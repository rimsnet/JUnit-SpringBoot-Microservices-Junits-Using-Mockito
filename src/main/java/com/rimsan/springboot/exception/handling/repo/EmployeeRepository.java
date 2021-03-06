package com.rimsan.springboot.exception.handling.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rimsan.springboot.exception.handling.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public Employee getEmbloyeById(Long empId);
}
