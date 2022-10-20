package com.example.controllers;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.MusicEmployee;
import com.example.services.MusicEmployeeService;

@RestController
//@RequestMapping("/api")
@CrossOrigin("*")
public class MusicEmployeeController {
	
	private MusicEmployeeService mService;
	
	@Autowired
	public MusicEmployeeController(MusicEmployeeService mService) {
		this.mService = mService;
	}
	
	@PostMapping("/register")
	MusicEmployee register(@RequestBody MusicEmployee e) {
		return mService.registerEmployee(e);
	}
	
	@PostMapping("/login")
	ResponseEntity<Object> login(@RequestBody LinkedHashMap<String, String> body){
		
		String email = body.get("email");
		String password = body.get("password");
		
		MusicEmployee e = mService.loginEmployee(email, password);
		
		if(e == null) {
			return new ResponseEntity("Unable to login", HttpStatus.UNAUTHORIZED);
		}
		else {
			return new ResponseEntity(e, HttpStatus.OK);
		}
		
	}
	
	@PostMapping("/editor")
	Boolean isEditor(@RequestBody LinkedHashMap<String, String> body) {
		
		Integer id = Integer.parseInt(body.get("id"));
		return mService.getEmployeeById(id).isEditor();
	}
	
	
	
	
	

}
