package com.spring.web.todo.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isValidUsername = username.equalsIgnoreCase("h");
		boolean isValidPassword = password.equals("j");
		
		return isValidUsername && isValidPassword;
}
}
