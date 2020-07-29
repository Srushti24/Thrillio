package com.semanticsquare.thrillio.entities;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.semanticsquare.thrillio.constants.MovieGenre;
import com.semanticsquare.thrillio.managers.BookmarkManager;

class MovieTest {

	@Test
	void testIsKidFriendlyEligible() {
		//Test1 - Movie genre is Horror -- return false
		Bookmark movie = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane","",	1941,	new String[] {"Orson Welles","Joseph Cotten"},	new String[] {"Orson Welles"}, MovieGenre.HORROR, 8.5);
		Boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertFalse("If movie genre is Horror the method must return false",isKidFriendlyEligible);
		
		//Test2 - Movie genre is Thrillers --- return false
		movie = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane","",	1941,	new String[] {"Orson Welles","Joseph Cotten"},	new String[] {"Orson Welles"}, MovieGenre.THRILLERS, 8.5);
		isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertFalse("If movie genre is Thrillers the method must return false",isKidFriendlyEligible);
	}

}