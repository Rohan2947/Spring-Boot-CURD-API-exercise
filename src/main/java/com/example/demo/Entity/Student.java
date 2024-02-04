package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
	@Id
	private int rollNo;
	private String name;
	private String address;
	private String email;
	private String gender;
	
	
	
	public Student() {
		
	}
	public Student(int rollNo, String name, String address, String email, String gender) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.email = email;
		this.gender = gender;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", gender=" + gender + "]";
	}
	
	

}
