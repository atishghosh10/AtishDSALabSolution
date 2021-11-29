package com.atish.service;

import java.util.Random;
import java.util.Scanner;

import com.atish.model.Employee;

public class CredentialService {
//	String email, password;
//	Employee emp = new Employee(email, password);
//	public Object showCredentials;

	public String generateNewPassword() {

		String data = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/.?<>");

		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
//			password[i] = data.charAt(random.nextInt(data.length()));
			password[i] = 'a';

		}
		System.out.println(password);
		return password.toString() ;
	}

	public String generateEmailAddress(String firstName, String lastName, String department) {

		return firstName + lastName + "@" + department + ".abc.com";

	}

	

	public void showCredentials(Employee emp2, String generatedEmail, String Password) {
		System.out.println("Dear " + emp2.getfirstName() + " your generated credentials are as follows");
		System.out.println("Email --" + generatedEmail);
		System.out.print("Password --" + Password.toString());
//		System.out.print("Password --" + "abc");


	}

}
