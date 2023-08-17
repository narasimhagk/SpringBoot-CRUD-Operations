package net.javaspring.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaspring.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Long>{

}
