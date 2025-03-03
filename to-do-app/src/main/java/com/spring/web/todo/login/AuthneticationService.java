package com.spring.web.todo.login;

public class AuthneticationService {
	public boolean authenticate(String username, String password) {
		boolean.isValidUsername = username.equalsIgnoreCase("loda");
		boolean.isValidPassword = password.equals("loda");
		
		return isValidUsername && isValidPassword;
}
