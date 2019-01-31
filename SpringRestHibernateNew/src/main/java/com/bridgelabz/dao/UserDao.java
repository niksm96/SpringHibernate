package com.bridgelabz.dao;

import java.util.List;

import com.bridgelabz.model.User;

public interface UserDao {
	int register(User user);

	User login(User user);

	boolean updateUser(User user);

	List<User> getUsersList();

	void deleteUser(String id);
}
