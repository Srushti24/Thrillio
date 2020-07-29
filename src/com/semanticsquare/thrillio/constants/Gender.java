package com.semanticsquare.thrillio.constants;

public enum Gender {
 MALE(0),
 FEMALE(1),
 TRANSGENDER(2);
	
	private int Gender;
	
	private Gender(int Gender) {
		this.Gender=Gender;
	}

	public int getGender() {
		return Gender;
	}

	public void setGender(int gender) {
		Gender = gender;
	}
	
	
	

}
