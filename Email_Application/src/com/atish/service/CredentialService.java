package com.atish.service;

import java.util.Random;
import java.util.Scanner;

import com.atish.model.Employee;

public class CredentialService {
	String email,password;
	Employee emp = new Employee(email, password);
	public Object showCredentials;
	public char[] generatePassword() {
		
	String data = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/.?<>");
	
	Random random= new Random();
	char[] password = new char[8];
	for(int i=0; i<8;i++) {
		password[i] = data.charAt(random.nextInt(data.length()));
		
	}
	return password;
	
	public String generateEmailAddress(String firstName,String LastName, String department) {
		String lastName;
		return firstName + lastName + "@" + department + ".abc.com";
		
		}
	public void showCredentials() {
		System.out.println("Dear "+ emp.getfirstName() + " your generated credentials are as follows");
		System.out.println("Email --" + email);
		System.out.print("Password --"+ "");
		char[] generatedPassword;
		System.out.print(generatedPassword);
		
		
	}
	public void showCredentials(Employee emp2, String generatedEmail, char[] generatedPassword) {
		
		
	}
	
}
