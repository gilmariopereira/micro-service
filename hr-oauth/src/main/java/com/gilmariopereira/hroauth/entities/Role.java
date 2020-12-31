package com.gilmariopereira.hroauth.entities;

import java.io.Serializable;


public class Role implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String Role;
	
	public Role() {
			
	}
	public Role(Long id, String role) {
		super();
		this.id = id;
		Role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}
	
	
	

}
