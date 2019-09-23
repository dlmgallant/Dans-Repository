package com.web.RestWebServiceClient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {

	
	@Autowired
	EmployeeDao dao;
	
	
	 public  List<Employee> getAllEmployees()
	 {
		 return dao.getAllEmployees();
	 }
	
	 public  String saveEmployee(Employee e)
	 {
		 return dao.saveEmployee(e);
	 }
	 public  String updateEmployee(Employee e)
	 {
		 return dao.updateEmployee(e);
	 }
	 
	 public  String deleteEmployee(Employee e)
		{
		 return dao.deleteEmployee(e);
		}
	 
	 
	 public  Employee getEmployeeByID(int id)
	 {
		return  dao.getEmployeeByID(id);
	 }
	 
	 public double getEmployeeSalaryTotal()
	 {
		 double total=0;
		 for(Employee e : dao.getAllEmployees())
			 total=total+e.getSalary();
		 
		 return total;
	 }
	
	//I will write functions to call DAO and massage them
}
