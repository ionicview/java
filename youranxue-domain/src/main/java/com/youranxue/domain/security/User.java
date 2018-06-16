package com.youranxue.domain.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.Data;

@Data
public class User {

	private String name;

	private String username;

	private String email;

	private String password;

	private String firstName;

	private String lastName;

	public void encodePassword(PasswordEncoder passwordEncoder) {
		this.password = passwordEncoder.encode(this.password);
	}

}
