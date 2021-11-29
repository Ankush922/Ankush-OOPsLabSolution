package com.abc.service;

import java.util.Random;

import com.abc.model.Employee;


public class CredentialService {
	public char[] generatePassword() {
		String capitalletters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallletters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialcharacters="!@#$%^&*_-.<>?/}";
		
		Random random=new Random();
		String values=capitalletters+smallletters+numbers+specialcharacters;
		
		char[] password=new char[8];
		
		for(int i=0; i<8 ;i++) {
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
	public String generateEmailAddress(String firstname, String lastname, String department) {
		return firstname+lastname+"@"+department+".abc.com";
		
	}
	public void showCredentials(Employee employee, String email, char[] generatePassword) {
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email    ----> "+email);
		System.out.print("Password ----> ");
		System.out.print(generatePassword);
		
	}
}
