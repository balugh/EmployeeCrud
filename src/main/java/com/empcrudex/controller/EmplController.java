package com.empcrudex.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empcrudex.entity.Empl;
import com.empcrudex.service.EmplServiceImpl;

@RestController
@RequestMapping("api/v1")
public class EmplController {

	public EmplController(EmplServiceImpl emplserviceimpl) {
		super();
		this.emplserviceimpl = emplserviceimpl;
	}
	

	private EmplServiceImpl emplserviceimpl;
	
	@PostMapping("/save")
	public Empl saveEmployee(@RequestBody Empl empl) {
		return emplserviceimpl.saveEmployee(empl);
	}
	@GetMapping("/employeeslist")
	public List<Empl> getAllEmployees(){
		return emplserviceimpl.getAllEmployees();
	}
	
	@GetMapping("/empbyid/{id}")
	public Empl getEmployeeById(@PathVariable("id") int emplid) {
		return emplserviceimpl.getEmployeeById(emplid);
	}
	
	@PutMapping("/update/{id}")
	public Empl updateEmployee(@PathVariable("id") int emplid, @RequestBody Empl empl) {
		return emplserviceimpl.updateEmployee(empl, emplid);
	}
}
