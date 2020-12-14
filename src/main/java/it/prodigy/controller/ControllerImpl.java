package it.prodigy.controller;

import java.util.List;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import it.prodigy.entity.Employee;
import it.prodigy.services.EmployeeService;

@Controller("Employee")
public class ControllerImpl {
	
	
	private EmployeeService employeeService = new EmployeeService();
	
	public void saveEmployee(Employee employee) {
		employeeService.saveEmployee(employee);
	}
	
	public void updateEmployee(Employee employee) {
		employeeService.updateEmployee(employee);
	}
	
	public Employee getEmployeeById(Integer id) {
		return employeeService.getEmployeeById(id);
	}
	
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	public void deletsEmployee(Integer id) {
		employeeService.deletsEmployee(id);
	}
}
