package com.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="music_employee")
public class MusicEmployee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employee_id")
	private Integer employeeId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	
	private String email;
	
	private String password;
	
	private boolean editor;

	
	
	
	
	public MusicEmployee() {
		super();
	}





	public MusicEmployee(Integer employeeId, String firstName, String lastName, String email, String password,
			boolean editor) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.editor = editor;
	}





	public MusicEmployee(Integer employeeId, String firstName, String lastName, String email, String password) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.editor = false;
	}





	public Integer getEmployeeId() {
		return employeeId;
	}





	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}





	public String getFirstName() {
		return firstName;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getLastName() {
		return lastName;
	}





	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public boolean isEditor() {
		return editor;
	}





	public void setEditor(boolean editor) {
		this.editor = editor;
	}





	@Override
	public String toString() {
		return "MusicEmployee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", password=" + password + ", editor=" + editor + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
