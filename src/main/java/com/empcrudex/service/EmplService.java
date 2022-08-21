package com.empcrudex.service;

import java.util.List;

import com.empcrudex.entity.Empl;

public interface EmplService {

	List<Empl> getAllEmployees();
	Empl saveEmployee(Empl empl);
	Empl getEmployeeById(int emplid);
	Empl updateEmployee(Empl empl, int emplid);
	
	
}
