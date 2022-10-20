package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.MusicEmployee;

public interface MusicEmployeeRepo extends JpaRepository<MusicEmployee, Integer> {
	
	public MusicEmployee findByEmail(String email);

}
