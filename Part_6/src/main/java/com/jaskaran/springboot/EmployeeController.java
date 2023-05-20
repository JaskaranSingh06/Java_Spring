package com.jaskaran.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		List<Employee> employeesList = new ArrayList<>();
		employeesList.add(new Employee(1, "John", 69000, "IT"));
		employeesList.add(new Employee(2, "Becky", 75000, "Admin"));
		employeesList.add(new Employee(3, "Mathew", 65000, "HR"));
		employeesList.add(new Employee(4, "Charles", 73000, "Marketing"));
		return employeesList;
	}
	
	@PostMapping("/employees")
	public String addEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		return "Data Stored Successfully";
	}
}
