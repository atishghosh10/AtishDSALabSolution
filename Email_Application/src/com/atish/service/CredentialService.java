package com.atish.service;

import java.util.Random;
import java.util.Scanner;

import com.atish.model.Employee;

public class CredentialService {

	public String generatePassword() {

		String data = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*_=+-/.?<>");
		Random random = new Random();
		String password = "";
		for (int i = 0; i < 8; i++) {
			password = password + data.charAt(random.nextInt(data.length()));
		}
		return password.toString();
	}

	public String generateEmailAddress(String firstName, String lastName, String department) {

		return firstName + lastName + "@" + department + ".abc.com";

	}

	public void showCredentials(Employee emp2, String generatedEmail, String password) {
		System.out.println("Dear " + emp2.getfirstName() + " your generated credentials are as follows");
		System.out.println("Email  --->" + generatedEmail);
		System.out.print("Password ---> " + password.toString());

	}

}
