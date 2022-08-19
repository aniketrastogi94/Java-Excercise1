package com.freecharge.java.excercise1.service;

import java.util.List;

import com.freecharge.java.excercise1.exception.UserAlreadyExistsException;
import com.freecharge.java.excercise1.exception.UserNotFoundException;
import com.freecharge.java.excercise1.model.User;

public interface IUserService {
	public List<User> getAllUsers();
	public User getUserById(int id) throws UserNotFoundException;
	public User saveUser(User user) throws UserAlreadyExistsException;
	public User updateuser(User user) throws UserNotFoundException;
	public boolean deleteUser(User user) throws UserNotFoundException;
}
