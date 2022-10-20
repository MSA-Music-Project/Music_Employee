package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.models.MusicEmployee;
import com.example.repo.MusicEmployeeRepo;

@Service
@Transactional
public class MusicEmployeeService {
	
	private MusicEmployeeRepo mRepo;
	
	@Autowired
	public MusicEmployeeService(MusicEmployeeRepo mRepo) {
		this.mRepo = mRepo;
	}
	
	public MusicEmployee registerEmployee(MusicEmployee e){
		String email = e.getEmail();
		
		MusicEmployee search = mRepo.findByEmail(email);
		
		if(search != null) {
			return null;
			
		}
		
		 return mRepo.save(e);
		
	
		
	}
	
	public MusicEmployee loginEmployee(String email, String password) {
		
		MusicEmployee search = mRepo.findByEmail(email);
		
		if(search != null && search.getPassword().equals(password)) {
			return search;
		}
		return null;
		
	}
	
	
	public MusicEmployee getEmployeeById(Integer id) {
		return mRepo.findById(id).get();
	}

}
