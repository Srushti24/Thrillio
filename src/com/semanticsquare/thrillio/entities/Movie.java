package com.semanticsquare.thrillio.entities;

import java.util.*;

import com.semanticsquare.thrillio.constants.MovieGenre;

public class Movie extends Bookmark {
	@Override
	public String toString() {
		return "Movie [releaseYear=" + releaseYear + ", cast=" + Arrays.toString(cast) + ", directors="
				+ Arrays.toString(directors) + ", genre=" + genre + ", imbRating=" + imbRating + ", imdbRating="
				+ imdbRating + "]";
	}

	private int releaseYear;
	private String[] cast;
	private String[] directors;
	private MovieGenre genre;
	private double imbRating;

	public MovieGenre getGenre() {
		return genre;
	}

	public void setGenre(MovieGenre classics) {
		this.genre = classics;
	}

	public double getImbRating() {
		return imbRating;
	}

	public void setImbRating(double imbRating) {
		this.imbRating = imbRating;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String[] getCast() {
		return cast;
	}

	public void setCast(String[] cast) {
		this.cast = cast;
	}

	public String[] getDirectors() {
		return directors;
	}

	public void setDirectors(String[] directors) {
		this.directors = directors;
	}

	public double getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}

	private double imdbRating;

	@Override
	public boolean isKidFriendlyEligible() {
		if(getGenre().equals("Horror") || getGenre().equals("Thrillers")) {
			return false;
		}
		return true;
	}

	
}
