package it.prodigy;

import java.util.List;

import it.prodigy.controller.ControllerImpl;
import it.prodigy.entity.Employee;

public class App {

	public static void main(String[] args) {
		
		ControllerImpl controllerImp = new ControllerImpl();
		Employee employee = new Employee("123456789","farshad", 'B', "vahidifard", "via via", 'M', 30000, "666558888", 1);
		
		controllerImp.saveEmployee(employee);
		
		//Employee employee3 = controllerImp.getEmployeeById("666558888");
		//List<Employee> employees = controllerImp.getAllEmployees();
		
		/*for(Employee e: employees)
			System.out.println(e);*/
		
		/*
		Employee employee2 = controllerImp.getEmployeeById(employee.getId());
		System.out.println(employee2);*/
	}

}
