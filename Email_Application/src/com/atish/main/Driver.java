package com.atish.main;

import java.util.Scanner;

import com.atish.model.Employee;
import com.atish.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		String firstName,lastName;
		String generatedEmail;
		char[] generatedPassword;
		CredentialService cs = new CredentialService();
		
		System.out.println("Enter employee first name and last name");
		Scanner sc = new Scanner(System.in);
		firstName=sc.nextLine();
		lastName=sc.nextLine();
		Employee emp = new Employee(firstName,lastName);
		
		System.out.println("Please enter the department from the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int option = sc.nextInt();
		
		switch(option) {
		
		case 0:
			break;
		case 1:
			 generatedEmail = cs.generateEmailAddress(emp.getfirstName().toLowerCase(),emp.getlastName().toLowerCase(),"ad");
			 generatedPassword = cs.generatePassword();
			 cs.showCredentials(emp, generatedEmail, generatedPassword);
			break;
		case 2:
			generatedEmail = cs.generateEmailAddress(emp.getfirstName().toLowerCase(),emp.getlastName().toLowerCase(),"tech");
			 generatedPassword = cs.generatePassword();
			 cs.showCredentials(emp, generatedEmail, generatedPassword);
			 break;
		case 3:
			generatedEmail = cs.generateEmailAddress(emp.getfirstName().toLowerCase(),emp.getlastName().toLowerCase(),"hr");
			 generatedPassword = cs.generatePassword();
			 cs.showCredentials(emp, generatedEmail, generatedPassword);
		case 4:
			generatedEmail = cs.generateEmailAddress(emp.getfirstName().toLowerCase(),emp.getlastName().toLowerCase(),"leg");
			 generatedPassword = cs.generatePassword();
			 cs.showCredentials(emp, generatedEmail, generatedPassword);
		default:
			System.out.println("Please Enter valid option");
			
		}
		
		
		}
		

	}

}
