package com.semanticsquare.controllers;

import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.constants.KidFriendlyStatus;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.managers.BookmarkManager;

public class BookmarkController {

	private static BookmarkController instance=new BookmarkController();
	
	private BookmarkController(){}
	
	public static BookmarkController getInstance() {
		return instance;
	}

	public void saveUserBookmark(User user,
			Bookmark bookmark) {
		
		BookmarkManager.getInstance().saveUserBookmark(user,bookmark);
		
	}

	public void setKidFriendlyStatus(User user, KidFriendlyStatus kidFriendlyStatus, Bookmark bookmark) {
		// TODO Auto-generated method stub
		BookmarkManager.getInstance().setKidFriendlyStatus(user,kidFriendlyStatus, bookmark);
		
	}

	public void share(User user, Bookmark bookmark) {
		// TODO Auto-generated method stub
		BookmarkManager.getInstance().share(user,bookmark);
		
	}
	
	
}
