package com.abc.service;

import java.util.Scanner;

import com.abc.model.Employee;

public class DriverClass {
	public static void main(String args[]) {
		Employee employee=new Employee("Ankush","Kanekar");
		
		CredentialService cs=new CredentialService();
		
		String generatedEmail;
		char[] generatedPassword;
		
		System.out.println("Please enter the name of department: ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human resource");
		System.out.println("4. Legal");
		
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		switch(option) {
		
		case 1:
		{
			generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"tech");
			generatedPassword=cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
					break;
		}
		case 2:
		{
			generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"adm");
					generatedPassword=cs.generatePassword();
					cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}
		case 3:
		{
			generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"hr");
					generatedPassword=cs.generatePassword();
					cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}
		case 4:
		{
			generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"lg");
					generatedPassword=cs.generatePassword();
					cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		}
		default:{
			System.out.println("Enter a valid option");
			break;
		}
		}
	}

	private static void generateEmail() {
		// TODO Auto-generated method stub
		
	}
}
