package com.semanticsquare.thrillio.dao;

import java.util.ArrayList;
import java.util.List;

import com.semanticsquare.thrillio.DataStore;
import com.semanticsquare.thrillio.entities.User;

public class UserDao {

	public List<User> getUser(){
	return DataStore.getUsers();	
	}
}
