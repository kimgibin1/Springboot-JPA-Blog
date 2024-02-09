package com.example.blog.model;

import java.security.Timestamp;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class User {
  
	@id
	private int id; // auto_increament
	
	private String username;
	
	private String password;
	
	private String email;
	
	private Timestamp createDate;
	
}
