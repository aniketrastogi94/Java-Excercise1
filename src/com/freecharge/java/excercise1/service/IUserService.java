package com.freecharge.java.excercise1.service;

import java.util.List;

import com.freecharge.java.excercise1.exception.UserAlreadyExistsException;
import com.freecharge.java.excercise1.exception.UserNotFoundException;
import com.freecharge.java.excercise1.model.UserModel;

public interface IUserService {
	public List<UserModel> getAllUsers();
	public UserModel getUserById(int id) throws UserNotFoundException;
	public UserModel saveUser(UserModel user) throws UserAlreadyExistsException;
	public UserModel updateuser(UserModel user) throws UserNotFoundException;
	public boolean deleteUser(UserModel user) throws UserNotFoundException;
}
