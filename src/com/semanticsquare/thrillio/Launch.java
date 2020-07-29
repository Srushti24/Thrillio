package com.semanticsquare.thrillio;

import java.util.ArrayList;
import java.util.List;

import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.managers.UserManager;

public class Launch {

	/**
	 * @param args
	 */
	
	private static List<User> users;
	private static List<List<Bookmark>> bookmark;
	
	public static void main(String[] args) {
		
		loadData();
		//start();

	}

	private static void start() {
		// TODO Auto-generated method stub
		
		System.out.println("user is browsing");
		for(int i=0;i<users.size();i++)
		{
			View.Browse(users.get(i), bookmark);
			
		}
		
	}

	private static void loadData() {
		// TODO Auto-generated method stub
		System.out.println("load data");
		DataStore.loadData();
		users=UserManager.getInstance().getUser();
		bookmark=BookmarkManager.getInstance().getBookmarks();
		System.out.println("printing data");
		printUserData();
		printBookmarkData();
	}

	private static void printBookmarkData() {
		// TODO Auto-generated method stub
		for(int i=0;i<bookmark.size();i++)
		{
			for(int j=0;j<bookmark.get(i).size();j++)
			{
				System.out.println(bookmark.get(j));
			}
			
		}
		
	}

	private static void printUserData() {
		// TODO Auto-generated method stub
		for(int i=0;i<users.size();i++)
		{
			System.out.println(users.get(i));
		}
		
	}

}
