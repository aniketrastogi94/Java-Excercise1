package com.freecharge.java.excercise1.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.freecharge.java.excercise1.model.*;

public class UserCsvReader {
	private static final String user_csv_file_path = "C:\\Users\\aniket.rastogi\\eclipse-workspace\\System Design\\data\\user.csv";
	public List<UserModel> getUserListFromCsv(){
		List<UserModel> UserList = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File(user_csv_file_path)))){
			br.readLine();
			UserList = new ArrayList<>();
			String userData = null;
			while( (userData = br.readLine()) != null) {
				String[] userDataSplit = userData.split(",");
				System.out.println(userData);
				UserModel user = new UserModel();
				user.setId(Integer.parseInt(userDataSplit[0]))
					.setEmail(userDataSplit[1])
					.setName(userDataSplit[2])
					.setContactNo(userDataSplit[3])
					.setMemberShip(userDataSplit[4]);
				UserList.add(user);
			}
		} catch(Exception e) {	
			e.printStackTrace();
		} 
		return UserList;
	}
	
	public static void main(String[] args) {
		System.out.println("hello world");
		UserCsvReader e= new UserCsvReader();
		List<UserModel>Users = e.getUserListFromCsv();
		for(UserModel user:Users) {
			System.out.println(user.toString());
		}
	}
}
