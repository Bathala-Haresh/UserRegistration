
/**
 * @author Bathala Haresh
 * @since 28/07/2021
 * Purpose: USER REGISTRATION PROBLEM: user registrartion problem needs to ensure all validations are in place during the user entry
 */
package com.bridglabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistrationimpl implements UserRegistrartion{
	/*
	 * Purpose: method to validate first name.
	 * Condition for regex is, first name should start 
	 * with capital letter and name should have minimum 3 letters.
	 *
	 * @param firstName: takes the first name argument given by user 
	 */

	@Override
	public void firstNameValidate(String firstName) {
		Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{3,20}$");
		Matcher matcher=pattern.matcher(firstName);

		if (matcher.matches())
		{
			System.out.println("You entered " +firstName +" is valid");
		}
		else
		{
			System.out.println("You entered " +firstName +" is invalid");
		}


	}
	/*
	 * Purpose: method to validate last name.
	 * Condition for regex is, last name should start 
	 * with capital letter and name should have minimum 3 letters.
	 *
	 * @param lastName: takes the last name argument  given by user 
	 */

	@Override
	public void lastNameValidate(String lastName) {

		Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{3,20}$");
		Matcher matcher=pattern.matcher(lastName);
		if (matcher.matches())
		{
			System.out.println("You entered " +lastName +" is valid");
		}
		else
		{
			System.out.println("You entered " +lastName +" is invalid");
		}

	}
	/*
	 * Purpose: method to validate valid phoneNumber .
	 * Condition for regex is, country code followed by space and 10 digit number
	 *  
	 */

	@Override
	public void phoneNumberValidate() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		Pattern pattern=Pattern.compile("^[0-9]{2}[\\s][0-9]{10}$");

		System.out.println("Enter your Phone Number : ");
		String phoneNumber=sc.nextLine();
		Matcher matcher=pattern.matcher(phoneNumber);

		if (matcher.matches())
			System.out.println("You entered Phone Number  is valid");
		else
			System.out.println("You entered Phone Number is invalid");
	}
	/*
	 * Purpose: method to validate email.
	 * Condition for regex is, email has 3 mandatory parts that should be followed
	 *
	 * @param email: takes the email argument given by user 
	 */

	@Override
	public void emailValidate(String email) {
		Pattern pattern=Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		Matcher matcher=pattern.matcher(email);

		if (matcher.matches())
			System.out.println("You entered email  is valid");
		else
			System.out.println("You entered email is invalid");
	}
	/*
	 * Purpose: method to validate password.
	 * Condition for regex is:
	 * minimum 8 characters 
	 * should have atleast 1 upper case
	 * should have atleast 1 numeric number
	 * has exactly 1 special character
	 * should clear all email samples
	 * @param password: takes the password argument given by user 
	 */

	@Override
	public void passwordValidate(String password) {		

		Pattern pattern=Pattern.compile("^(?=.{8,20})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
		Matcher matcher=pattern.matcher(password);

		if (matcher.matches())
			System.out.println("You entered email  is valid");
		else
			System.out.println("You entered email is invalid");


	}

}


