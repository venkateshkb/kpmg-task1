package kpmg.task.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kpmg.task.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
