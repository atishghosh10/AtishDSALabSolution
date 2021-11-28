package com.atish.model;

public class Employee {
	private String firstName;
	private String lastName;

	public String getfirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Employee(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
