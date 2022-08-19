package com.freecharge.java.excercise1.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.freecharge.java.excercise1.model.*;

public class UserCsvReader {
	private static final String USER_CSV_FILE_PATH  = "C:\\Users\\aniket.rastogi\\eclipse-workspace\\System Design\\data\\user.csv";
	public List<User> getUserListFromCsv(){
		List<User> userList = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File(USER_CSV_FILE_PATH)))){
			br.readLine();
			userList = new ArrayList<>();
			String userData = null;
			while( (userData = br.readLine()) != null) {
				String[] userDataSplit = userData.split(",");
				User user = new User();
				user.setId(Integer.parseInt(userDataSplit[0]))
					.setEmail(userDataSplit[1])
					.setName(userDataSplit[2])
					.setContactNo(userDataSplit[3])
					.setMemberShip(userDataSplit[4]);
				userList.add(user);
			}
		} catch(Exception e) {	
			e.printStackTrace();
		} 
		return userList;
	}
}
