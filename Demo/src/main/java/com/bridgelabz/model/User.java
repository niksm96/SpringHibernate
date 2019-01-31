package com.bridgelabz.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private int userId;

	private String name;

	private long contact;

	private String email;

	private String password;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String name, long contact, String email, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", contact=" + contact + ", email=" + email + ", password="
				+ password + "]";
	}

}
