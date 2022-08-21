package com.empcrudex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.empcrudex.entity.Empl;
import com.empcrudex.repository.EmplRepository;

@Service
public class EmplServiceImpl implements EmplService{

	private EmplRepository emplrepo;

	public EmplServiceImpl(EmplRepository emplrepo) {
		super();
		this.emplrepo = emplrepo;
	}

	@Override
	public List<Empl> getAllEmployees() {
		// TODO Auto-generated method stub
		return emplrepo.findAll();
	}

	@Override
	public Empl saveEmployee(Empl empl) {
		// TODO Auto-generated method stubs
		return emplrepo.save(empl);
	}

	public Empl getEmployeeById(int emplid) {
		Optional<Empl> empl=emplrepo.findById(emplid);
		if(empl.isPresent()) {
			return empl.get();
		}	
		else return null;

	}

	@Override
	public Empl updateEmployee(Empl empl, int emplid) {
		Empl existingEmpl = emplrepo.findById(emplid).orElseThrow(null);
		return existingEmpl;
	}

	


}
