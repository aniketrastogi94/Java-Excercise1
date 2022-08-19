package com.freecharge.java.excercise1.repository;
import java.util.List;
import com.freecharge.java.excercise1.model.*;
import com.freecharge.java.excercise1.util.*;

public class UserRepository {
	private List<User> userList;
	private UserCsvReader userCsvReader;
	
	public UserRepository() {
		this.userCsvReader=new UserCsvReader();
		this.userList=this.userCsvReader.getUserListFromCsv();
	}
	
	public List<User> getUsersList(){
		return this.userList;
	}
}

