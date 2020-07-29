package com.semanticsquare.thrillio;

import java.util.List;

import com.semanticsquare.controllers.BookmarkController;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.partner.Shareable;
import com.semanticsquare.thrillio.constants.KidFriendlyStatus;
import com.semanticsquare.thrillio.constants.UserType;
import com.semanticsquare.thrillio.entities.Bookmark;

public class View {

/*	public static void Bookmark(User user, Bookmark[][] bookmarks){
		System.out.println("\n" + user.getEmail() + " is browsing items...");
		for(int i=0;i<DataStore.USER_BOOKMARK_LIMIT;i++)
		{
			int typeOffset=(int)(Math.random()* DataStore.BOOKMARK_TYPES_COUNT);
			int bookmarkOffset=(int)(Math.random()* DataStore.BOOKMARK_COUNT_PER_TYPE);
			Bookmark bookmark=bookmarks[typeOffset][bookmarkOffset];
			BookmarkController.getInstance().saveUserBookmark(user,bookmark);
			System.out.println(bookmark);
		}
	}
	
	*/
	
	
	public static void Browse(User user, List<List<Bookmark>> bookmark2){
		System.out.println("\n" + user.getEmail() + " is browsing items...");
		int bookmarkCount=0;
		for(List<Bookmark> bookmarklist: bookmark2)
		{
			for(Bookmark bookmark : bookmarklist)
			{
				if(bookmarkCount< DataStore.USER_BOOKMARK_LIMIT)
				{
					boolean isBookmarked = getBookmarkDecision(bookmark);
					if (isBookmarked)
					{
						bookmarkCount++;
						BookmarkController.getInstance().saveUserBookmark(user,bookmark);
						System.out.println("New Item bookmarked" +bookmark);
					}
				}
				
				if (user.getUserType().equals(UserType.EDITOR) || user.getUserType().equals(UserType.CHIEF_EDITOR)) 
				{
					if (bookmark.isKidFriendlyEligible() && bookmark.getKidFriendlyStatus().equals(KidFriendlyStatus.UNKNOWN))
					{
						KidFriendlyStatus kidFriendlyStatus = getKidFriendlyStatusDecision(bookmark);
						if (!kidFriendlyStatus.equals(KidFriendlyStatus.UNKNOWN)) 
						{
							BookmarkController.getInstance().setKidFriendlyStatus(user, kidFriendlyStatus, bookmark);
							

						}
					}
					
		        }
				
				if (bookmark.getKidFriendlyStatus().equals(KidFriendlyStatus.APPROVED)
						&& bookmark instanceof Shareable) {
                     boolean isShared = getShareDecision(bookmark);
                     if(isShared) {
                    	 BookmarkController.getInstance().share(user,bookmark);
                     }
	
			}
		}
	}
	}

	private static KidFriendlyStatus getKidFriendlyStatusDecision(Bookmark bookmark) {
		// TODO Auto-generated method stub
		return Math.random() < 0.4 ? KidFriendlyStatus.APPROVED
				: (Math.random() >= 0.4 && Math.random() < 0.8) ? KidFriendlyStatus.REJECTED
						: KidFriendlyStatus.UNKNOWN;
		
	}

	private static boolean getShareDecision(Bookmark bookmark) {
		return Math.random() < 0.5 ? true : false;
	}

	

	private static boolean getBookmarkDecision(Bookmark bookmark) {
		return Math.random() < 0.5 ? true : false;

	}
}
