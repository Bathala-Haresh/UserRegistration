/**
 * @author Bathala Haresh
 * @since 28/07/2021
 * Purpose: USER REGISTRATION PROBLEM: user registrartion problem needs to ensure all validations are in place during the user entry
 */

package com.bridglabz;

public interface UserRegistrartion 
{
	void firstNameValidate(String firstName);
	void lastNameValidate(String lastName);
	void phoneNumberValidate();
	void emailValidate(String email);

}
