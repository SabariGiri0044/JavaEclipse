package com.mrsabu;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name ="Emp_details")
public class Employeedetails {
	@Id
	private int emp_id;
	private String name;
	private String empdomain;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpdomain() {
		return empdomain;
	}
	public void setEmpdomain(String empdomain) {
		this.empdomain = empdomain;
	}
}
