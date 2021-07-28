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
}
