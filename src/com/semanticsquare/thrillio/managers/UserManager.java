package com.semanticsquare.thrillio.managers;

import java.util.ArrayList;
import java.util.List;

import com.semanticsquare.thrillio.constants.Gender;
import com.semanticsquare.thrillio.dao.UserDao;
import com.semanticsquare.thrillio.entities.User;

public class UserManager {
	private static UserManager instance = new UserManager();
	private static UserDao dao=new UserDao();
	
	
	private UserManager() {
	}
	
	public static UserManager getInstance() {

		return instance;
	}
	
	
	public User createUser(long id, String email, String password, String firstName, String lastName, Gender male,
			String userType) {

		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(male);
		user.setUserType(userType);

		return user;
	}
	
	public List<User> getUser(){
		return dao.getUser();
	}

}
